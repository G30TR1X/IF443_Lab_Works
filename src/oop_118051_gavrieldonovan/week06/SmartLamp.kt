package oop_118051_gavrieldonovan.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Memulai booting lampu $name, dengan id: $id")
    }

    override fun turnOff() {
        println("Mematikan lampu $name, dengan id: $id")
    }
}