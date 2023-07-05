package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    val vetor = intArrayOf(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    println("DIFERENCA = ${getDiferenca(vetor)}")

}

fun getDiferenca(x: IntArray): Int{
    return (x[0] * x[1] - x[2] * x[3]);
}