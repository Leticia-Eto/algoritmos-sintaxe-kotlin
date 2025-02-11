fun main() {

    println("Nota 1:")
    val n1 = readLine()?.toFloatOrNull() ?: 0f  
    
    println("Nota 2:")
    val n2 = readLine()?.toFloatOrNull() ?: 0f  
    
    println("Nota 3:")
    val n3 = readLine()?.toFloatOrNull() ?: 0f  
    
    println("Nota 4:")
    val n4 = readLine()?.toFloatOrNull() ?: 0f  
    
    
    val soma = n1 + n2 + n3 + n4
    
   
    val media = soma / 4
    
    
    println("A média das notas é: $media")
}
