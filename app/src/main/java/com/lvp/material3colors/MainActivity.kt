package com.lvp.material3colors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import com.lvp.material3colors.ui.theme.Material3ColorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { _, insets -> insets }
        super.onCreate(savedInstanceState)
        setContent {
            Material3ColorsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .systemBarsPadding()
                            .verticalScroll(rememberScrollState())
                    ) {
                        listOf(
                            Pair("surface", MaterialTheme.colorScheme.surface,),
                            Pair("surfaceVariant", MaterialTheme.colorScheme.surfaceVariant,),
                            Pair("onSurfaceVariant", MaterialTheme.colorScheme.onSurfaceVariant,),
                            Pair("onSurface", MaterialTheme.colorScheme.onSurface,),
                            Pair("surfaceTint", MaterialTheme.colorScheme.surfaceTint,),
                            Pair("inverseSurface", MaterialTheme.colorScheme.inverseSurface,),
                            Pair("inverseOnSurface", MaterialTheme.colorScheme.inverseOnSurface,),
                            Pair("primary", MaterialTheme.colorScheme.primary,),
                            Pair("onPrimary", MaterialTheme.colorScheme.onPrimary,),
                            Pair("primaryContainer", MaterialTheme.colorScheme.primaryContainer,),
                            Pair("onPrimaryContainer", MaterialTheme.colorScheme.onPrimaryContainer,),
                            Pair("inversePrimary", MaterialTheme.colorScheme.inversePrimary,),
                            Pair("secondary", MaterialTheme.colorScheme.secondary,),
                            Pair("onSecondary", MaterialTheme.colorScheme.onSecondary,),
                            Pair("secondaryContainer", MaterialTheme.colorScheme.secondaryContainer,),
                            Pair("onSecondaryContainer", MaterialTheme.colorScheme.onSecondaryContainer,),
                            Pair("background", MaterialTheme.colorScheme.background,),
                            Pair("onBackground", MaterialTheme.colorScheme.onBackground,),
                            Pair("error", MaterialTheme.colorScheme.error,),
                            Pair("onError", MaterialTheme.colorScheme.onError,),
                            Pair("errorContainer", MaterialTheme.colorScheme.errorContainer,),
                            Pair("onErrorContainer", MaterialTheme.colorScheme.onErrorContainer,),
                            Pair("tertiary", MaterialTheme.colorScheme.tertiary,),
                            Pair("onTertiary", MaterialTheme.colorScheme.onTertiary,),
                            Pair("tertiaryContainer", MaterialTheme.colorScheme.tertiaryContainer,),
                            Pair("onTertiaryContainer", MaterialTheme.colorScheme.onTertiaryContainer,),
                            Pair("outline", MaterialTheme.colorScheme.outline,),
                            Pair("outlineVariant", MaterialTheme.colorScheme.outlineVariant,),
                            Pair("scrim", MaterialTheme.colorScheme.scrim,),
                        ).forEach {
                            Row {
                                Box(
                                    modifier = Modifier
                                        .size(32.dp)
                                        .background(it.second)
                                )
                                Spacer(modifier = Modifier.size(16.dp))
                                Text(text = it.first)
                            }
                            Spacer(modifier = Modifier.size(16.dp))
                        }
                    }
                }
            }
        }
    }
}