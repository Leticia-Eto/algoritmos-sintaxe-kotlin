fun main() {

    println("Salário por hora:")
    val salario = readLine()?.toFloatOrNull() ?: 0f 
    println("Número de horas trabalhadas no mês:")
    val hora = readLine()?.toFloatOrNull() ?: 0f 
    val multiplicacao= salario*hora
    println("Total do seu salário no referido mês:  $multiplicacao")
}

