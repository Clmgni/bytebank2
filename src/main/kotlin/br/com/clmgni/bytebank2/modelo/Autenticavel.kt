package br.com.clmgni.bytebank2.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}