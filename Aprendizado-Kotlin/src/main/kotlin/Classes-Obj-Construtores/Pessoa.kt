package `Classes-Obj-Construtores`

class Pessoa (var nome: String, var idade: Int){
    override fun toString(): String{
        return "Classe Pessoa: $nome, $idade";
    }
}

fun main(){
    var cassio = Pessoa("Cassio", 20);
    println(cassio);
}