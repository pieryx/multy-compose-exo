package Quiz

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.RadioButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.asFloatState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun QuestionScreen(q:Question) {

    val selectedValue = remember { mutableStateOf("") }
    var reply:Int=0;
    val label = "Item"
    var progress =0.01f

    fun nextQuestion() {
        TODO("Not yet implemented")
    }

    Scaffold (bottomBar = {
        Column {
            Button(onClick = { nextQuestion() }, modifier = Modifier) {
                Text("Next")
            }
            LinearProgressIndicator(
                modifier = Modifier.fillMaxWidth()
                    .height(15.dp),
                progress = progress
            )
        }

    }) {
        Column(
            modifier = Modifier.background(Color.DarkGray).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Card {
                Column (modifier = Modifier.padding(10.dp)){
                    Text(q.label)
                }
            }
                Column(modifier = Modifier.fillMaxWidth(),verticalArrangement = Arrangement.Center,
                    ){

                        q.answers.forEach { answer ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                RadioButton(
                                    selected = selectedValue.value == label,
                                    onClick = { selectedValue.value = label; reply = answer.id }
                                )
                                Text(
                                    text = answer.label,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }

            }

            }

        }
        }
}
