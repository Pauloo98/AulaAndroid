package br.com.aula01paulo




fun main() {
    exercicioUm(1,1.3,"Oi")
    exercicioDois(3,2)
    exercicioTres(118)
    exercicioQuatro(1,1,1,1,1,100,-100)
    exercicioCinco(1,2,3,4,2)
    exercicioSeis(1,2,3,4,101,102)
}

// EXERCICIO 01

fun exercicioUm(umNumeroA: Int, umNumeroB: Double, umaCadeiaDeTexto: String) {
    println("$umNumeroA, $umNumeroB, $umaCadeiaDeTexto")
    println(umNumeroA+umNumeroB)
    println(umNumeroA - umNumeroB)
}

// EXERCICIO 02

fun exercicioDois(numA: Int, numB: Int) {
    return println(numA < numB)
}

// EXERCICIO 03

fun exercicioTres(numero: Int) {
    return println(numero % 2 == 1 && numero > 10)
}

// EXERCICIO 04

fun exercicioQuatro(vararg numeros: Int){
    val lista = arrayListOf<Int>()
    var resultado = 0
    for(num in numeros){
        lista.add(num)
        resultado += num
    }
    println(lista)
    println(resultado)
}

// EXERCICIO 05

fun exercicioCinco(vararg numeros: Int){
    val lista = arrayListOf<Int>()
    for(num in numeros){
        if(num % 2 == 0){
            lista.add(num)
        }
    }
    return println(lista.sum())
}

// EXERCICIO 06

fun exercicioSeis(vararg numeros: Int){
    val lista = arrayListOf<Int>()
    for(num in numeros){
        if(num % 2 == 0){
            lista.add(num)
        }
    }
    return println(lista)
}