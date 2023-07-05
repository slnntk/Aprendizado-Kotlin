package Variaveis

fun main(){
    var nome = "Cássio";   // MUTÁVEL
    val nomeval = "Tiago"; // IMUTAVEL

    nome = "Tiago";
}

class variaveis{
    var teste: String = "Tiago"; // obriga você a iniciar a variavel
    lateinit var teste1: String; // não obriga iniciar a várivavel.


    fun initvariavel{
        teste = "Cassio";
        teste1 = "a";
    }
}