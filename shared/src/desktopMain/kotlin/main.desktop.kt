import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Desktop"

@Composable fun MainView() = App()

@Preview
@Composable
fun AppPreview() {
    App()
}

@Preview
@Composable
fun skillPreview() {
    Skills(arrayOf(Competence("test",2),Competence("test",2),Competence("test",2),Competence("test",2),Competence("test",2),Competence("test",2),Competence("test",2)))
}

// Quizz Preview
@Preview
@Composable
fun AppQuizz() {
    Quiz.WelcomeScreen()
}

@Preview
@Composable
fun ScoreQuizz() {
    Quiz.ScoreScreen("10/20")
}