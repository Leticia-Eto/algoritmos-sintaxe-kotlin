fun main() {
    println("Celsius:")
    val c = readLine()?.toFloatOrNull() ?: 0f 
    val transformacao=(((9*c)+160)/5)
    println("Em Fahrenheit:  $transformacao")
}