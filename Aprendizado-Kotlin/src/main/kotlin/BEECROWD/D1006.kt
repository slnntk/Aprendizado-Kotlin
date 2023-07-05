package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    println("MEDIA = ${"%.1f".format(getMedia2(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()))}")
}

fun getMedia2(a: Double, b: Double, c:Double):Double{
    return (a*2 + b*3 + c*5) / 10;
}
