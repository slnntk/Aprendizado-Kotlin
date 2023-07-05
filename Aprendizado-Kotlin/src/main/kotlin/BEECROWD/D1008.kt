package BEECROWD

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`);
    val funcionario = Funcionario(sc.nextInt(), sc.nextInt(), sc.nextDouble());
    println("NUMBER = ${funcionario.number}")
    println("SALARY = U$ ${"%.2f".format(funcionario.getTotalSalary())}")
}

data class Funcionario(val number: Int, val hoursWorked: Int, val valuePerHour: Double){
    fun getTotalSalary(): Double{
        return hoursWorked * valuePerHour;
    }
}