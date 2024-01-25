
fun main() {
    try {
        val coche1 = coche("Rojo", "Seat", "Ateca")
        coche1.setPuertas(4)
        coche1.setCaballos(120)
        coche1.setMatricula("7976HSD")
        coche1.cambiarColor()
        val coche2 = coche("Negro", "Dodge", "Charger")
        coche2.setPuertas(3)
        coche2.setCaballos(700)
        coche2.setMatricula("7984RTY")
        println("-----------INFO DE LOS COCHES-----------")
        println(coche1.toString())
        println(coche2.toString())
        println("----------------------------------------")

    } catch (e: Exception) {
        println(e)
    }
}