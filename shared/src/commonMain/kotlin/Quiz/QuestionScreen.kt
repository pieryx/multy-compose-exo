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
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.asFloatState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun QuestionScreen(q:List<Question>) {
    var selectedValue  by remember { mutableStateOf(0) }
    var currentIndex by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }
    var finish by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    fun nextQuestion() {
        if(selectedValue==q[currentIndex].correctId && !finish) {
            score++
        }
        selectedValue=0
        if(currentIndex+1<q.size){
            currentIndex++

        }else{
            finish=true
            scope.launch {
                snackbarHostState.showSnackbar("c'est fini ton score est de: "+score.toString())
            }
        }
    }

    Scaffold ( snackbarHost = {
        SnackbarHost(hostState = snackbarHostState)
    },bottomBar = {
        Column (modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            if(!finish){
                Button(onClick = { nextQuestion() }, modifier = Modifier) {
                    Text("Next")
                }
            }else{
                Button(onClick = { nextQuestion() }, modifier = Modifier) {
                    Text("Résultat")
                }
            }

            LinearProgressIndicator(
                modifier = Modifier.fillMaxWidth()
                    .height(15.dp),
                progress = (currentIndex+1).toFloat()/q.size.toFloat()
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
                        Text(q[currentIndex].label)
                    }
                }
                Column(modifier = Modifier.fillMaxWidth(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
                {

                    q[currentIndex].answers.forEach { answer ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            RadioButton(
                                selected = selectedValue == answer.id,
                                onClick = { selectedValue = answer.id}
                            )
                            Text(
                                text = answer.label
                            )
                        }

                    }
                }

            }
        }
}
