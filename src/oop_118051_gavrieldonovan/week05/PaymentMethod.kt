package oop_118051_gavrieldonovan.week05

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}