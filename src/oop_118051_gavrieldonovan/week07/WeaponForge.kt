package oop_118051_gavrieldonovan.week07

class Weapon private constructor(var item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(GameItem("Pedang Midas", 50, ItemRarity.EPIC), 150)
        }
    }
}