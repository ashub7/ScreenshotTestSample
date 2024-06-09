package com.manta.composescreenshot


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.manta.composescreenshot.ui.theme.ComposescreenshotTheme

class LoginScreenshotTest {
    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposescreenshotTheme {
            Greeting("Android!")
        }
    }
}
