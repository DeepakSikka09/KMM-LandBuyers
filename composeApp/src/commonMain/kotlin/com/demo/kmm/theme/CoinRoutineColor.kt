package com.demo.kmm.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CoinRoutineColor(
    val profileGreen:Color=Color.Unspecified,
    val lossRed:Color=Color.Unspecified
    // Unspecified-
)

val ProfileGreenColor=Color(color = 0xFF485F84)
val LossRedColor=Color(color = 0xFFD5E3FF)

val DarkProfileGreenColor=Color(color = 0xFF485F84)
val DarkLossRedColor=Color(color = 0xFFD5E3FF)

val LightCustomColorsPalette = CoinRoutineColor(
    profileGreen=ProfileGreenColor,
            lossRed=LossRedColor,
)

val DarkCustomColorsPalette = CoinRoutineColor(
    profileGreen=ProfileGreenColor,
    lossRed=LossRedColor,
)

val LocalCoinRoutineColor= compositionLocalOf {CoinRoutineColor()}