package oop_118051_gavrieldonovan.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) = items.add(item)

    fun getAll(): List<T> = items
}