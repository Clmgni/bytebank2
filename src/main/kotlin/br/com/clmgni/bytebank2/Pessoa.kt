package br.com.clmgni.bytebank2

class Pessoa(nome: String = "", saldo: Double = 0.00) {

    var saldo: Double = saldo
        get() = field
        set(value) {
            field = value
        }
    var nome = nome
        get() = field
        set(value) {
            println("SetNome -> $value")
            field = value
        }

}