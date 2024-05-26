fun main() {

    val bird = Animal2("Parrot", 2)

    bird.getInfo()

}




//constructor
class Animal2(type:String,legs:Int){
    private var type:String = type
   private var legs:Int = legs

    fun getInfo(){
        println("Type = $type  legs = $legs")
    }
}
