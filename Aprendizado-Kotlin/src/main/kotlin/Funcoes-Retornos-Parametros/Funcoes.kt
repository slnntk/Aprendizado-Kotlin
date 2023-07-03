package `Funcoes-Retornos-Parametros`


fun main(): Unit{
    /*é permitido dizer qual parametro vai ser atribuido*/
    println(somarTwoNumbers(2,1));
    println(somarTwoNumbers(y = 1, x = 2));

    println(retornaHello());

    println(beecrowd02(10,9));
}

fun beecrowd02(x: Int, y: Int): String{
    return "X = ${x+y}\n"
}

fun somarTwoNumbers(x: Int, y: Int): Int{
    return x+y;
}

fun retornaHello(): String{
    return "Tiago";
}