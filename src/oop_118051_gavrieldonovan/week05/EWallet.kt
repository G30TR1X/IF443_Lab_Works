package oop_118051_gavrieldonovan.week05

class EWallet(
    accountName: String,
    var balance: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance < amount) {
            println("Saldo $accountName Tidak Cukup")
            return
        }

        balance -= amount
        println("Transaksi $accountName Sukses")
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName Berhasil Top Up")
    }
}