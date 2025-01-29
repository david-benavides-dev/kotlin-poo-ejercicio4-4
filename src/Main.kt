import classes.Coche

fun main() {
    val coche1 = Coche("Azul", "marca", "modelo", 87, 4, "1234567")
    val coche2 = Coche("Blanco", "marca", "modelo", 87, 4, "1234567")

    println(coche1)
    println("")
    println(coche2)


    // * Intenta instanciar y modificar con la marca y modelo con valores nulos o blancos y comprueba que no es posible.
    try {
        coche1.marca = ""
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }

    try {
        coche2.modelo = ""
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }


    // * Intenta instanciar y modificar con el número de caballos con un valor inferior a 70 o superior a 700 y comprueba que no es posible.
    try {
        coche1.numCaballos = 25
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }

    try {
        coche2.numCaballos = 777
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }


    // * Intenta instanciar y modificar con el número de puertas con un valor inferior a 3 o superior a 5 y comprueba que no es posible.
    try {
        coche1.numeroPuertas = 1
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }

    try {
        coche2.numeroPuertas = 10
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }


    // * Intenta instanciar y modificar con la matrícula con un valor que no tenga 7 caracteres y comprueba que no es posible.
    try {
        coche1.matricula = "1234578910"
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }


    // * Intenta instanciar y modificar con el color, el número de caballos, el número de puertas y la matrícula con valores nulos/blancos y comprueba que no es posible.
    try {
        coche1.color = null
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }

    try {
        coche1.numCaballos = null
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }

    try {
        coche2.numeroPuertas = null
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }

    try {
        coche1.matricula = null
    } catch (e: IllegalArgumentException) {
        println("ERROR >> ${e.message}")
    }
}