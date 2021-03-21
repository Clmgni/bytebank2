package br.com.clmgni.bytebank2

import junit.framework.TestCase
import org.junit.Test

class PessoaTest : TestCase(){

    private val pessoa1 = Pessoa("João da Silva",100.09)

    @Test
    fun whenCreatingonePerson() {
        var pessoa2: Pessoa = Pessoa("João da Silva",100.09)
        assertEquals(pessoa2,pessoa1 )
    }
}