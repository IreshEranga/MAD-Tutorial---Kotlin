fun main() {

    val bird = Animal3("lion", 4)

    bird.getInfo()

}




//constructor
class Animal3(private val type:String,
              private val legs:Int){
    fun getInfo(){
        println("Type = $type  legs = $legs")
    }
}
