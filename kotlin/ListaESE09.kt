fun main() {

    println("Fahrenheit:")
    val f = readLine()?.toFloatOrNull() ?: 0f 
    val transformacao= 5 * ((f-32) / 9)
    println("Em Celsius:  $transformacao")
}