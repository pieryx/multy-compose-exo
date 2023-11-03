package Quiz

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScoreScreen(res:String) {
    Card(modifier = Modifier.padding(5.dp), backgroundColor = Color.Green) {
        Column (modifier = Modifier.padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text("Score", modifier = Modifier.padding(5.dp), fontSize = 25.sp)
            Text(res, Modifier.padding(5.dp))
            Button(onClick = { reTakeQuizz() }, modifier = Modifier.padding(5.dp)) {
                Text("Retake the Quizz")
            }
        }

    }

}

fun reTakeQuizz() {
    TODO("Not yet implemented")
}
