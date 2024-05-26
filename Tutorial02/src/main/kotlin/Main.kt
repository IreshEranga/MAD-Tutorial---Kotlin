fun main(){

    val bird = Animal()
    bird.type = "parrot"
    bird.legs = 2

    println("Type = ${bird.type}  legs = ${bird.legs}")
}

class Animal{
    var type:String = ""
    var legs:Int = 0
}

