
data class Competence(val name:String,val rate:Int);
data class Diplome(val name:String,val date:String,val description:String);
data class ExperiencePro(val name:String,val date:String,val competence:String);
data class InfoCv(val nom:String, val prenom:String,val age:Number,val tel:String,val email:String, val diplome:Array<Diplome>,val experience:Array<ExperiencePro>,val competences:Array<Competence>)