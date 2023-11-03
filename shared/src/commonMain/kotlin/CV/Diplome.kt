
import androidx.compose.runtime.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Diplome(d:Array<Diplome> ){
    MaterialTheme{

        Column {
            d.forEach { diplome->
                Column(modifier = Modifier.padding(5.dp).background(color = Color(216, 234, 236)).fillMaxWidth()) {

                    Text(diplome.date  +" | ", modifier = Modifier.padding(5.dp, 0.dp, 5.dp, 0.dp))
                    Text(diplome.name, modifier = Modifier.padding(5.dp, 0.dp, 0.dp, 0.dp))
                }
                Text(diplome.description, modifier = Modifier.padding(10.dp))
            }
        }
    }
}