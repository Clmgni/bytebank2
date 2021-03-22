
import br.com.clmgni.bytebank2.Logando
import br.com.clmgni.bytebank2.NiveisMensagem
import br.com.clmgni.bytebank2.NiveisMensagem.INFO
import br.com.clmgni.bytebank2.Pessoa
import br.com.clmgni.bytebank2.Util
import java.text.NumberFormat

fun main() {

    try {
        Util.iLog("SystemOut")
        Util.gLog(Logando(INFO, "Iniciando"))
        Util.gLog(Logando(NiveisMensagem.WARNING, "Executando"))

        var Pessoa1: Pessoa = Pessoa(Util.limpaNome("Jose Porco"), 100.0)
        Pessoa1.nome = "Joaquim Jose da Silva Pinto"

        when {
            Util.validaNome(Pessoa1.nome) -> {
                Util.gLog(Logando(INFO, "Nome válido: ${Pessoa1.nome}"))
            }
            else -> {
                Util.gLog(Logando(NiveisMensagem.SEVERE, "Nome inválido: ${Pessoa1.nome}"))
                throw  IllegalArgumentException ("Usuário com nome inválido: ${Pessoa1.nome}")
            }
        }

        println("--------------------------------------")
        println(Pessoa1.getDados())
        println("--------------------------------------")

        println(java.util.TimeZone.getDefault().displayName)
        println(NumberFormat.getInstance().currency)

    } catch (e: Exception) {
        println(e)
    } finally {
        Util.gLog(Logando(INFO, "Finalizado"))
    }

}