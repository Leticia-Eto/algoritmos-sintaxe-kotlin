fun main() {
    println("Metro:")
    val m = readLine()?.toFloatOrNull() ?: 0f 
    val metro_centimetro = m*100

    println("Em centimetros:  $metro_centimetro")
}
