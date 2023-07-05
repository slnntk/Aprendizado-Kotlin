package BEECROWD

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    val vendedor = Vendedor(sc.next(), sc.nextDouble(), Vendas(sc.nextDouble()));
    println("TOTAL = R$ ${String.format("%.2f", vendedor.getSalaryMoreCommission())}");
}

data class Vendedor(private val name: String, private val salary: Double, private val sales: Vendas){
    fun getSalaryMoreCommission(): Double{
        return sales.getCommission() + salary;
    }
}

data class Vendas(private val valueFromAllSales: Double){
    private val commission: Double = 0.15
    fun getCommission(): Double{
        return valueFromAllSales * commission;
    }
}