
import br.com.clmgni.bytebank2.Logando
import br.com.clmgni.bytebank2.NiveisMensagem
import br.com.clmgni.bytebank2.NiveisMensagem.INFO
import br.com.clmgni.bytebank2.Pessoa
import br.com.clmgni.bytebank2.Util

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
        println("Nome: ${Pessoa1.nome}")
        println("Nome: ${Pessoa1.saldo}")
        println("--------------------------------------")

    } catch (e: Exception) {
        println(e)
    } finally {
        Util.gLog(Logando(INFO, "Finalizado"))
    }

}