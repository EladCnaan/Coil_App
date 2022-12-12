package com.example.coil_app.row_cards

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ViewModelCards : ViewModel() {
    private val _personcards = MutableStateFlow(listOf<Person>())

    val personCards: StateFlow<List<Person>> get() = _personcards

    private val personRepository = PersonRepository()
    private val getAllData = personRepository.getAllData()

    private val _expandedPersonCardIdsList = MutableStateFlow(listOf<Int>())
    val expandedPersonCardIdsList  : StateFlow<List<Int>> get() =_expandedPersonCardIdsList

    init {
        getData(getAllData)
    }

    private fun getData(getAllData: List<Person>) {
        viewModelScope.launch(Dispatchers.Default) {
            _personcards.emit(getAllData)
        }
    }

    fun onPersonCardArrowClicked(cardId: Int) {
        _expandedPersonCardIdsList.value = _expandedPersonCardIdsList.value.toMutableList().also { list ->
            if (list.contains(cardId)) list.remove(cardId) else list.add(cardId)
        }
    }
}
