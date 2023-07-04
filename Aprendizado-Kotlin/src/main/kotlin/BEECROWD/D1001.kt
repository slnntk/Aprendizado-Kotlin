package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    println(beecrowd02(sc.nextInt(), sc.nextInt()));
}

fun beecrowd02(x: Int, y: Int): String{
    return "X = ${x+y}"
}