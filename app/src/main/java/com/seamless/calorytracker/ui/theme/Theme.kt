package com.seamless.calorytracker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.seamless.calorytrackerprep.ui.theme.Typography
import com.seamless.core_ui.*

private val DarkColorPalette = darkColors(
    primary = Color.White,
    primaryVariant = Color.White,
    secondary = Orange,
    background = Black,
    onBackground = TextWhite,
    surface = Color.Black,
    onSurface = TextWhite,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
)

private val LightColorPallete = darkColors(
    primary = Color.Black,
    primaryVariant = Color.Black,
    secondary = Orange,
    background = Black,
    onBackground = TextWhite,
    surface = Color.White,
    onSurface = TextWhite,
    onPrimary = Color.White,
    onSecondary = Color.White,
)



@Composable
fun CaloryTrackerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors =if(darkTheme) DarkColorPalette else LightColorPallete

    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}