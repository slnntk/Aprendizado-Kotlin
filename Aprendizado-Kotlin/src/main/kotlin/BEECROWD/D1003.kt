import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`);
    println("SOMA = ${getSoma(sc.nextInt(), sc.nextInt())}")
}

fun getSoma(x: Int, y: Int):Int{
    return x+y;
}