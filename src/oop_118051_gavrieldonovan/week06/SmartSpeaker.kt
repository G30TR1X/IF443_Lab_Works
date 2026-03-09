package oop_118051_gavrieldonovan.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Menyalakan speaker $name, dengan id: $id")
    }

    override fun turnOff() {
        println("Mematikan speaker $name, dengan id: $id")
    }

    fun playMusic(song: String) {
        println("Memainkan lagu $song dari Spotify.")
    }
}