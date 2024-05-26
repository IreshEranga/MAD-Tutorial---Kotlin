fun main(){

    val bird = Animal1("Parrot",2)


    println("Type = ${bird.type}  legs = ${bird.legs}")
}



//constructor
class Animal1(type:String,legs:Int){
    var type:String = type
    var legs:Int = legs
}