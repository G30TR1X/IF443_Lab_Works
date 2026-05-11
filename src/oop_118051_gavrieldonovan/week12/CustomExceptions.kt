package oop_118051_gavrieldonovan.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance:  $balance") {}