package oop_118051_gavrieldonovan.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) = items.add(item)

    fun getAll(): List<T> = items

    fun <T : Any> search(item: T): Boolean {
        for (i in items) {
            if (i is Coin && item is Coin) {
                if (i.name == item.name) {
                    return true
                }
            }
        }

        return false;
    }
}