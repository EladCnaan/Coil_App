package com.example.coil_app.row_cards

import androidx.compose.runtime.Immutable

@Immutable
data class Person(
    val id: Int,
    val title: String,
    val body: String,
    val section: String,
    val Image: String
)
