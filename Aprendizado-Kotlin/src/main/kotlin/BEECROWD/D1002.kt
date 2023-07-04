package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    println("A=${"%.4f".format(getArea(sc.nextDouble()))}")
}

fun getArea(raio: Double): Double{
    return 3.14159 * Math.pow(raio, 2.00);
}

