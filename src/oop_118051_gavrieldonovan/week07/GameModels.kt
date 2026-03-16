package oop_118051_gavrieldonovan.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(50),
    UNCOMMON(35),
    RARE(10),
    EPIC(4),
    LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)