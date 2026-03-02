package oop_118051_gavrieldonovan.week05

class EWallet(
    accountName: String
) : PaymentMethod(accountName) {
    var balance: Double = 0.0

    override fun processPayment(amount: Double) {
        if (balance < amount) {
            println("Saldo Tidak Cukup")
            return
        }

        balance -= amount
        println("Transaksi Sukses")
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}