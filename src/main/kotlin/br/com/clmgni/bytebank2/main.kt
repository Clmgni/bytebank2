import br.com.clmgni.bytebank2.util

fun main() {

    util.iLog()

    println(System.getProperty("user.language"))

    util.gLog("Iniciando!", "INFO")

    println(util.Companion.testeVar)

    var nome = "João da silva ####"
    var texto = util.validaNome(nome)
    var regexC = "[A-Z][a-z].* [A-Z][a-z].*".toRegex()

    if (texto.matches(regexC)) {
        println("Nome válido: $texto")
        util.gLog("Nome OK", "INFO")
    } else {
        println("Nome inválido: $texto")
        util.gLog("Nome não OK", "ERROR")

    }

}