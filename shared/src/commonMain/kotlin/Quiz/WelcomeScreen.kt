package Quiz

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


fun startTheQuizz() {
    TODO("Not yet implemented")
}

@Composable
fun WelcomeScreen() {
    Card(modifier = Modifier.padding(5.dp)) {
        Column (modifier = Modifier.padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text("Quizz", modifier = Modifier.padding(5.dp), fontSize = 25.sp)
            Text("A simple Quizz to discovers KMP,KMM and compose.",Modifier.padding(5.dp))
            Button(onClick = { startTheQuizz() }, modifier = Modifier) {
                Text("Start the Quizz")
            }
        }

    }
}