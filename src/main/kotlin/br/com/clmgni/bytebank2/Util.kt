package br.com.clmgni.bytebank2

import java.util.*
import java.util.logging.FileHandler
import java.util.logging.Level
import java.util.logging.Logger

class Util {

    companion object {

        var logger: Logger = Logger.getLogger("LoginngApp")

        fun iLog(nomeArquivo: String) {
            logger.addHandler(FileHandler(nomeArquivo+".log"))
        }

        fun gLog(oLog: Logando) {
            val logger: Logger = Logger.getLogger("LoginngApp")
            logger.log(Level.parse(oLog.nivel.toString()),oLog.mensagem)
        }

        fun limpaNome(Nome: String): String {
            return Nome.replace("[0-9]".toRegex(), "")
                       .replace("[#@$%&*()_+º~^!=;:.,/]"
                       .toRegex(), "")
        }

        fun validaNome(Nome: String): Boolean {
            return (Nome.matches("[A-Z][a-z].* [A-Z][a-z].*".toRegex()))
        }
        fun toLocalCurrency(valor: Double): String{
            return valor.toString() + " " + Currency.getInstance(Locale.getDefault())
        }
    }
}