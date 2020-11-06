package br.com.aula01paulo

fun main() {

    val cliente1 = Cliente("Paulo", "Araujo")
    val cliente2 = Cliente("Juliana", "Mendonça")

    val conta1 = Conta(123,10.0,cliente1)
    val conta2 = Conta(321,15.50,cliente2)


// DEPOSITO CONTA 1
    conta1.deposito(25.00)
    conta1.deposito(2.2)

// SAQUE CONTA 1
    conta1.saque(1.1)
    conta1.saque(2.22)

// DEPOSITO CONTA 2
    conta2.deposito(33.3)
    conta2.deposito(1.1)


// SAQUE CONTA 2
    conta2.saque(0.1)
    conta2.saque(2.1)


}

