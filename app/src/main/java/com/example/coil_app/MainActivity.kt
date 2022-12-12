package com.example.coil_app

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.coil_app.row_cards.RowsScreen
import com.example.coil_app.row_cards.ViewModelCards
import com.example.coil_app.ui_theme.AppTheme
import com.example.coil_app.row_cards.RowsScreen


class MainActivity : AppCompatActivity() {
    private val cardsViewModel by viewModels<ViewModelCards>()

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    RowsScreen(cardsViewModel)
                }
            }
        }
    }
}

