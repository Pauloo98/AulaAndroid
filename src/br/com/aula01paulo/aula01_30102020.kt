package br.com.aula01paulo

fun main() {
    maior(2,322,2)
    compara("oi", "oia")
    par(81)
    imprimePar()
    analisaNumero(11,10,30,4)
    contaAteCem()
}

// EXERCÍCIO 01

fun maior(num1: Int, num2: Int, num3: Int) {
    return println(maxOf(num1, num2, num3))
}

// EXERCICIO 02

fun compara(a: String, b: String) {
    return println(a != b)
}

// EXERCICIO 03


fun par(numero: Int) {
    return println(numero % 2 == 0)
}

// EXERCICIO 04

fun imprimePar() {
    for(num in 1..100) if(num % 2 == 1){
    println(num)
}
}

// EXERCICIO 05

fun analisaNumero(numA: Int, numB: Int, numC: Int, numD: Int) {
    if(numA > numC && numA > numD || numB > numC && numB > numD) {
        return println(true)
    } else return println(false)

}



// EXERCICIO 06

fun contaAteCem(){
    for(num in 1..100)
        println(num)
}




