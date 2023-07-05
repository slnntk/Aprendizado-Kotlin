package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    val n = sc.nextInt();
    for (i in 0 until n){
        var cabe = Cabe(Radius(sc.nextInt()), Radius(sc.nextInt()));
        println(cabe.getSmallerRadiusPossible());
    }
}

data class Cabe(val r1: Radius, val r2: Radius){
    fun getSmallerRadiusPossible():Int{
        return r1.value + r2.value;
    }
}

data class Radius(val value: Int){

}