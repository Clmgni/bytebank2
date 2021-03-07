package br.com.clmgni.bytebank2.modelo

import br.com.clmgni.bytebank2.modelo.Funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}