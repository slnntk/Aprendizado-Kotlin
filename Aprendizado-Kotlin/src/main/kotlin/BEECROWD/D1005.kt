package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    println("MEDIA = ${"%.5f".format(getMedia(sc.nextDouble(), sc.nextDouble()))}")
}

fun getMedia(a: Double, b: Double): Double {
    return (a * 3.5 + b * 7.5) / 11.0;
}