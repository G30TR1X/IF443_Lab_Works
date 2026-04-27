package oop_118051_gavrieldonovan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 100.0))
    coinRepo.add(Coin("ETH", 100.0))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach { println("Name: ${it.name}, Balance: ${it.balance}") }

    val txRepo =WalletRepository<Transaction>()
    txRepo.add(Transaction("T1", 5.0))
    txRepo.add(Transction("T2", 30.0))
    txRepo.add(Transaction("T3", 24.0))
}