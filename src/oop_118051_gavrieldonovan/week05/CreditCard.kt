package oop_118051_gavrieldonovan.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            println("Transaksi Sukses")
        } else {
            println("Transaksi Di tolak")
        }
    }
}