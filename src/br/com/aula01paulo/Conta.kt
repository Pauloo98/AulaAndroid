package br.com.aula01paulo

class Conta(val numeroDaConta: Int, var saldo: Double, val titular: Cliente) {

    fun deposito(valorDeposito: Double) {
        saldo += valorDeposito
//        var saldoAtual = valorDeposito + this.saldo
        return println("Você realizou um Depósito e seu novo saldo é de $saldo")
    }

    fun saque(valorSaque: Double) {
        if(valorSaque >= this.saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= valorSaque
            println("Você realizou um Saque e seu novo saldo é de $saldo")
        }
    }
}