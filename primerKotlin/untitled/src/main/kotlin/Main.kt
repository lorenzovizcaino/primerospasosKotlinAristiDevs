
fun main(){
    var num1:Int=4
    var num2:Int=6

    var numVal:Int=465
    numVal=466

    var num3:Long=34
    num3=443

    var num4:Float=45.4f

    var num5:Double=46.87

    var exampleChar:Char='/'

    var exampleString:String="Hola Mundo"

    var exampleBoolean:Boolean= true;

    var numSuma=sumar(num1,num2)
    println(numSuma)

}

fun sumar(num1: Int, num2: Int): Int {
    return num1+num2
}
