fun main() {
    
    println("Digite o primeiro número:")
    val numero1 = readLine()?.toIntOrNull() 
    
 
    println("Digite o segundo número:")
    val numero2 = readLine()?.toIntOrNull() 
    
  
    if (numero1 != null && numero2 != null) {
        val soma = numero1 + numero2 // Soma os dois números
        println("A soma de $soma.")
    } else {
        println("Por favor, insira números válidos.")
    }
}