package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    println("PROD = ${getProd(sc.nextInt(), sc.nextInt())}")
}

fun getProd(x: Int,y: Int): Int{
    return x * y;
}