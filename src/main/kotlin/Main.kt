import java.util.Scanner

fun main() {
    val leitura = Scanner(System.`in`)
    println("Digite uma palavra/frase: ")
    val palavra = leitura.nextLine()

    println("$palavra de trás pra frente é " + swap(palavra))

}

fun swap(palavra: String): String {
    val caracteres = palavra.toCharArray()
    var x = 0
    var y = caracteres.size - 1

    while(x <= y) {
        val temp = caracteres[x]
        caracteres[x] = caracteres[y]
        caracteres[y] = temp

        x++
        y--

    }

    return String(caracteres)

}