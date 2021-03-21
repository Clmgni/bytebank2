
import br.com.clmgni.bytebank2.Logando
import br.com.clmgni.bytebank2.Pessoa
import br.com.clmgni.bytebank2.niveisMensagem
import br.com.clmgni.bytebank2.niveisMensagem.INFO
import br.com.clmgni.bytebank2.util

fun main() {

    util.iLog("SystemOut")
    util.gLog(Logando(INFO,"Iniciando"))
    util.gLog(Logando(niveisMensagem.WARNING,"Executando"))

    var Pessoa1 = Pessoa("João da Silva",100.0)

    var texto = util.limpaNome(Pessoa1.nome)

    when {
        util.validaNome(texto) -> {
            Pessoa1.nome == texto
            util.gLog(Logando(INFO,"Nome válido: ${Pessoa1.nome}"))
        }
        else -> {
            util.gLog(Logando(INFO,"Nome inválido: $texto"))
        }
    }
    util.gLog(Logando(INFO,"Finalizando"))
}