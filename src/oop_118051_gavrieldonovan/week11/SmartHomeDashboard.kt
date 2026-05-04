package oop_118051_gavrieldonovan.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {
        name = "Phillips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val device = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }

    homeDevices.add(device)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }
    searchResult?.let {
        it.diagnose()
    }

    with(homeDevices) {
        println("Found ${this.size} devices")
        for (device in this) {
            println("${device.name} - ${device.category} - ${device.isOnline} - ${device.powerLoad}")
        }
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("\nTotal power: $totalPower")
}