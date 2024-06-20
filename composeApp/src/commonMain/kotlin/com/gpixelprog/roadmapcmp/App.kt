package com.gpixelprog.roadmapcmp

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.annotation.ExperimentalVoyagerApi
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.NavigatorDisposeBehavior
import cafe.adriel.voyager.transitions.SlideTransition
import roadmap_cmp.composeapp.generated.resources.*
import com.gpixelprog.roadmapcmp.theme.AppTheme
import com.gpixelprog.roadmapcmp.theme.LocalThemeIsDark
import com.gpixelprog.roadmapcmp.ui.screen.StartScreen
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

@OptIn(ExperimentalVoyagerApi::class)
@Composable
internal fun App() = AppTheme {
    Navigator(
        screen = StartScreen(),
        disposeBehavior = NavigatorDisposeBehavior(disposeSteps = false),
    ) {
        SlideTransition(
            navigator = it,
            disposeScreenAfterTransitionEnd = true
        )
    }
}

internal expect fun openUrl(url: String?)