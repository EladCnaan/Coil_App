package com.example.coil_app.ui_theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = purple200, // Main background color
    primaryVariant = purple700, // Grid lines of lists board
    secondary = teal200 // Used for text color
)

private val LightColorPalette = lightColors(
    primary = purple500, // Main background color
    primaryVariant = purple700, // Grid lines of lists board
    secondary = teal200, // Used for text color

/**
    background = Color.White,
    surface = lightGray, // Background of lists board
    onPrimary = accentAmber,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = accentAmber,
*/
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}