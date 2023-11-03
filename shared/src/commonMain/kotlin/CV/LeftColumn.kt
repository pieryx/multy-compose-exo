
import androidx.compose.runtime.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp

import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LeftColumn(icv:InfoCv){


    MaterialTheme{

            Image(
                painterResource("compose-multiplatform.xml"),
                contentDescription = "Compose Multiplatform icon",
                modifier = Modifier.width(150.dp)
                    .height(150.dp)
            )
            Text(icv.nom+" "+icv.prenom)
            Text(icv.age.toString()+" ans")
            Text("mobile: "+icv.tel)
            Text("mail: "+icv.email)
        }

}