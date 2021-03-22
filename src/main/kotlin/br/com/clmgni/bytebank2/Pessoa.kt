package br.com.clmgni.bytebank2

import java.text.NumberFormat

class Pessoa(nome: String = "", saldo: Double = 0.00) {

    var saldo: Double = saldo
        get() = field
        set(value) {
            field = value
        }
    var nome = nome
        get() = field
        set(value) {
            field = value
        }

    fun getDados(): String {
        return "O nome da pessoa é '$nome' e o saldo é '${NumberFormat.getCurrencyInstance().format(saldo)}'."
    }
}