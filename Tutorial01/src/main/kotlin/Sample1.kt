fun main(){
    println("Enter number 1")
    val number1 = readln()
    println("Enter number 2")
    val number2 = readln()
    println("Enter operator")
    val operator = readln()

    println("Output = ${calculae(number1.toFloat(),number2.toFloat(),operator)}")
}

fun calculae(n1:Float,n2:Float,op:String):Float{
    return when(op){
        "+"->n1+n2
        "-"->n1-n2
        "*"->n1*n2
        "/"->n1/n2
        "%"->n1%n2
        else -> -1.0f
    }
}