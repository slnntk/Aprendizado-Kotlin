package BEECROWD

import java.util.Scanner

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    var A = leitor.nextInt();
    var N = leitor.nextInt();
    var soma = 0;

    while (N <= 0) {
        N = leitor.nextInt();
    }

    for (i in 1..N) {
        soma += A;
        A++;
    }
    println(soma);
}