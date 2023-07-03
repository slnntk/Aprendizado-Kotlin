package `Atributos-Acessos`

/*
* val = imutavel
* var = mutavel
*/
class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono){
    override fun toString(): String{
        return "Classe Carro: $cor, $anoFabricacao, $dono";
    }
}

class Dono(var name: String, var idade: Int){
    override fun toString(): String{
        return "Classe Dono: $name, $idade";
    }
}

fun main(){
    var carro = Carro("Azul", 2010, Dono("Cássio", 20));
    
    println(carro.cor)
    carro.cor = "Preto";
    println(carro.cor)

    carro.dono.name = "Tiago";
    println(carro.dono.name);
}