package oop_118051_gavrieldonovan.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("Menyalakan CCTV $name, dengan id: $id")
        startRecord()
    }

    override fun turnOff() {
        println("Mematikan CCTV $name, dengan id: $id")
    }

    override fun startRecord() {
        println("Device mulai merekam")
    }
}