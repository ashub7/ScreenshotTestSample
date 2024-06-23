package com.manta.composescreenshot


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.manta.composescreenshot.ui.login.PrimaryButton

class PrimaryButtonScreenshotTest {
    @Preview(showBackground = true)
    @Composable
    fun PrimaryButtonPreview() {
        MaterialTheme {
            PrimaryButton("Login")
        }
    }
}
