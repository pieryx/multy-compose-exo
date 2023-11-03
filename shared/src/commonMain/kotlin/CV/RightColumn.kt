
import androidx.compose.runtime.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.sharp.Star

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp

import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.skia.Color

@OptIn(ExperimentalResourceApi::class)
@Composable
fun RightColumn(icv:InfoCv){

    MaterialTheme{
                Text(
                    "Alternance M2",
                    modifier = Modifier.background(color = androidx.compose.ui.graphics.Color(169,169,169))
                        .padding(20.dp).fillMaxWidth()
                )
                Text("Skills")

                    Skills(icv.competences)

                Text(
                    "Expériences",
                    modifier = Modifier.background(color = androidx.compose.ui.graphics.Color(169,169,169))
                        .padding(20.dp).fillMaxWidth()
                )
                Experience(icv.experience)
                Text(
                    "Diplomes",
                    modifier = Modifier.background(color = androidx.compose.ui.graphics.Color(169,169,169))
                        .padding(20.dp).fillMaxWidth()
                )
                Diplome(icv.diplome)
            }
}