fun main() {
    println("Raio:")
    val raio = readLine()?.toFloatOrNull() ?: 0f 
    val multiplicacao= raio*raio
    val area =3.14*multiplicacao
    println("ÁREA:  $area")
}