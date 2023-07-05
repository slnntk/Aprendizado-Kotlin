package `Estrutura-Condicional`

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`);
    println(parOuImpar(sc.nextInt()));
}

fun parOuImpar(number: Int): String{
    if (number % 2 == 0){
        return "Par";
    }
    return "Impar";
}