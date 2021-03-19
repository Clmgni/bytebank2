package br.com.clmgni.bytebank2

import java.util.logging.FileHandler
import java.util.logging.Logger

class util {

    companion object {
        var testeVar: String = "Valor de Teste"
        var logger: Logger = Logger.getLogger("LoginngApp")


        fun iLog() {
            logger.addHandler(FileHandler("statusApp.log"))
        }

        fun gLog(mensagem: String, nivel: String) {
            val logger: Logger = Logger.getLogger("LoginngApp")
            logger.addHandler(FileHandler("statusApp.log"))
            if (nivel == "INFO") {
                logger.info(mensagem)
            } else if (nivel == "ERROR") {
                logger.severe(mensagem)
            } else {
                logger.info(mensagem)
            }
        }
        fun validaNome(Nome: String): String {
            return Nome.replace("[0-9]".toRegex(), "").replace("[#@$%&*()_+º~^!=;:.,/]".toRegex(), "")
        }

    }

}


