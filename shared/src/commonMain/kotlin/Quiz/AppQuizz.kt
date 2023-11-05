package Quiz

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppQuizz() {

QuestionScreen(listOf<Question> (
    Question(1,"Andoid is a great platform1 ?",1, listOf<Answer>( Answer(1,"Yes"), Answer(2,"No"))),
    Question(2,"Andoid is a great platform 2?",1, listOf<Answer>( Answer(1,"Yes"), Answer(2,"No"))),
    Question(3,"Andoid is a great platform3 ?",1, listOf<Answer>( Answer(1,"Yes"), Answer(2,"No")))
))
}
