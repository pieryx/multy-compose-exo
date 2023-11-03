package Quiz
data class Answer(val id:Int, val label:String)
data class Question(val id:Int,val label:String,val  correctId:Int,val answers: List<Answer>)
data class Quiz(val questions :List<Question>)
