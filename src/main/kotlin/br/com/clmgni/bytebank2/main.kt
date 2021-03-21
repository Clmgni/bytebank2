
import br.com.clmgni.bytebank2.Logando
import br.com.clmgni.bytebank2.niveisMensagem.INFO
import br.com.clmgni.bytebank2.util

fun main() {

    util.iLog()
    util.gLog(Logando(INFO,"Iniciando"))

    var nome = "João da Silva ####"
    var texto = util.limpaNome(nome)

    when {
        util.validaNome(texto) -> {
            println("Nome válido: $texto")
            util.gLog(Logando(INFO,"Nome OK"))
        }
        else -> {
            println("Nome inválido: $texto")
            util.gLog(Logando(INFO,"Nome não OK"))
        }
    }
    util.gLog(Logando(INFO,"Finalizando"))
}