package com.manta.composescreenshot.ui.login


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Android
import androidx.compose.material.icons.outlined.Key
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manta.composescreenshot.ui.login.components.PasswordField
import com.manta.composescreenshot.ui.login.components.UserIdField
import com.manta.composescreenshot.ui.theme.ComposescreenshotTheme

@Composable
fun LoginScreen() {
    Surface {
        var uiState by remember { mutableStateOf(LoginUiState()) }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {

            Spacer(modifier = Modifier.height(100.dp))
            Icon(
                Icons.Outlined.Android,
                modifier = Modifier.size(100.dp),
                contentDescription = "",
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(50.dp))
            UserIdField(
                value = uiState.userId,
                onChange = { data -> uiState = uiState.copy(userId = data) },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            PasswordField(
                value = uiState.passsword,
                onChange = { data -> uiState = uiState.copy(passsword = data) },
                submit = {},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Login")
            }
        }
    }
}


@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
@Composable
fun LoginFormPreview() {
    ComposescreenshotTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true, device = "id:Nexus One", showSystemUi = true)
@Composable
fun LoginFormPreviewDark() {
    ComposescreenshotTheme(darkTheme = true) {
        LoginScreen()
    }
}

data class LoginUiState(
    var userId: String = "",
    var passsword: String = "",
) {
    fun isNotEmpty(): Boolean {
        return userId.isNotEmpty() && passsword.isNotEmpty()
    }
}