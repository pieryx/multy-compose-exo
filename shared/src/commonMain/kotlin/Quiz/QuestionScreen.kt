package Quiz

import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun QuestionScreen(q:Question) {
Card {
    Text(q.label)
}
}