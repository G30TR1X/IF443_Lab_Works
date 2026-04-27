package oop_118051_gavrieldonovan.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) = items.add(item)

    fun getAll(): List<T> = items

    fun <T : Any> search(item: T): Boolean {
        if (item is String) {
            for (i in items) {
                if (i.toString() == item.toString())
                    return true
            }
        } else {
            println("Item has to be a name!")
        }

        return false;
    }
}