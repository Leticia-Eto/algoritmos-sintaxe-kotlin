fun main() {
    println("lado:")
    val lado = readLine()?.toFloatOrNull() ?: 0f 
    val multiplicacao= (lado*lado)*2
    println("Dobro da área:  $multiplicacao")
}