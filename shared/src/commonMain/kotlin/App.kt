import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    val competences:Array<Competence> = arrayOf(Competence("Javascript",4),Competence("nodeJs",4),Competence("html",4),Competence("css",4),Competence("PHP",3),Competence("DataFactory",3),Competence("Prestashop",4))
    val experiences:Array<ExperiencePro> = arrayOf(ExperiencePro("Développeur Full Stack YzilY · Contrat en alternance","sept. 2022 - mai 2023"," Azure Data Factory | Rest Api | développement back and Front Magento 2"),ExperiencePro("Développeur IT Full StackDéveloppeur IT Full Stack Jocaflor · Contrat en alternance","nov. 2021 - sept. 2022","mise en place site | développement back and Front Prestashop/Wordpress"),ExperiencePro("Développeur webDéveloppeur web Sogea Caroni - VINCI Construction France · Stage","mai 2021 - juin 2021","Création et mise en place d'une API pour récupérer différentes données."))
    val diplomes:Array<Diplome> = arrayOf(Diplome("EFFICOME Mastère, Informatique","2022-2024","PHP · SQL · Git · Python (langage de programmation) · Bases de données · React.js · JavaScript · Développement web · C# · HTML"),Diplome("EFFICOME Bachelor, Informatique","2021-2022"," C++ · PHP · SQL · Git · Python (langage de programmation) · Bases de données · WordPress · JavaScript · Développement web · Vue.js · Node.js · C# · C · API REST · HTML · Feuilles de style en cascade (CSS)"),Diplome("Université Polytechnique Hauts-de-France DUT","2019-2021","C++ · PHP · SQL · Git · Python (langage de programmation) · Java · Bases de données · JavaScript · Développement web · AngularJS · C · HTML · Feuilles de style en cascade (CSS)"))
    val icv =InfoCv("Gomez","Pierre",23,"30.22.54.85.95","pierre222000@gmail.com",diplomes,experiences,competences);
    MaterialTheme{
        Scaffold {
            Row(
                Modifier.fillMaxSize()){
                Column (modifier = Modifier.background(color = Color.LightGray).padding(5.dp).fillMaxHeight().weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    LeftColumn(icv)
                }
                Column(
                    modifier = Modifier.fillMaxHeight().weight(2f).verticalScroll(
                        rememberScrollState()
                    ),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    RightColumn(icv)
                }

            }
        }
    }
    /*MaterialTheme {
        var greetingText by remember { mutableStateOf("Hello, World!") }
        var showImage by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                greetingText = "Hello, ${getPlatformName()}"
                showImage = !showImage
            }) {
                Text(greetingText)
            }
            AnimatedVisibility(showImage) {
                Image(
                    painterResource("compose-multiplatform.xml"),
                    contentDescription = "Compose Multiplatform icon"
                )
            }
        }
    }*/
}

expect fun getPlatformName(): String