
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

import androidx.compose.material.icons.sharp.Star
@OptIn(ExperimentalResourceApi::class)
@Composable
fun Skills(com:Array<Competence> ){
    MaterialTheme{

        var y:Int=0;
        var len= com.count()
        var numberYellowStars:Int
        var numberBlankStars:Int
        var i:Int
        for (y in 0.. len  step 3){
            numberYellowStars= com[y].rate//,com[y+1].rate,com[y+2].rate)
            numberBlankStars= 5-com[y].rate//,5-com[y+1].rate,5-com[y+2].rate)
            i=0
            Row (modifier = Modifier.padding(5.dp)) {
                for (i in 1..numberYellowStars) {
                    Text(
                        "x",
                        modifier = Modifier.background(Color(0, 255, 0)).padding(0.dp, 0.dp, 5.dp, 0.dp)
                    )
                }
                for (i in 1..numberBlankStars) {
                    //Image(modifier = M)
                    Text(
                        "x",
                        modifier = Modifier.background(Color(255, 0, 0)).padding(0.dp, 0.dp, 5.dp, 0.dp)
                    )
                }
                Text(com[y].name, modifier = Modifier.padding(5.dp, 0.dp, 5.dp, 0.dp))
                if(y+1<len){
                    i=0

                    numberYellowStars= com[y+1].rate//,com[y+2].rate)
                    numberBlankStars= 5-com[y+1].rate//,5-com[y+2].rate)
                    for (i in 1..numberYellowStars) {
                        Text(
                            "x",
                            modifier = Modifier.background(Color(0, 255, 0)).padding(0.dp, 0.dp, 5.dp, 0.dp)
                        )
                    }
                    for (i in 1..numberBlankStars) {
                        //Image(modifier = M)
                        Text(
                            "x",
                            modifier = Modifier.background(Color(255, 0, 0)).padding(0.dp, 0.dp, 5.dp, 0.dp)
                        )
                    }
                    Text(com[y+1].name, modifier = Modifier.padding(5.dp, 0.dp, 5.dp, 0.dp))
                    if(y+2<len){
                        i=0

                        numberYellowStars= com[y+2].rate
                        numberBlankStars= 5-com[y+2].rate
                        for (i in 1..numberYellowStars) {
                            Text(
                                "x",
                                modifier = Modifier.background(Color(0, 255, 0)).padding(0.dp, 0.dp, 5.dp, 0.dp)
                            )
                        }
                        for (i in 1..numberBlankStars) {
                            //Image(modifier = M)
                            Text(
                                "x",
                                modifier = Modifier.background(Color(255, 0, 0)).padding(0.dp, 0.dp, 5.dp, 0.dp)
                            )
                        }
                        Text(com[y+1].name, modifier = Modifier.padding(5.dp, 0.dp, 5.dp, 0.dp))
                    }
                }
            }

        }
    }
}