// Constructor primario
class Coche(var color: String? = null, val marca: String, val modelo: String, val numeroCaballos: Int, val numeroPuertas: Int? = null, val matricula: Int? = null) {
//    Crear una clase Coche, a través de la cual se pueda conocer el
//    color del coche, la marca, el modelo, el número de caballos, el número de puertas y
//    la matrícula. Crear el constructor del coche, así como el métod toString().
//
//    Marca y modelo no podrán ser blancos ni nulos y no podrán modificarse.
//    Número de caballos, número de puertas y matrícula no podrán modificarse, ni podrán ser nulos.
//    Color podrá modificarse, pero no podrá ser nulo.

    init {
        // Marca y modelo no podrán ser blancos ni nulos y no podrán modificarse.
        require(modelo.isNotEmpty() && modelo != null) { "El modelo no puede estar en blanco." }
        require(marca.isNotBlank() && modelo != null) { "La marca no puede estar en blanco." }
        require(numeroPuertas != null) { "El número de puertas no puede ser nulo" }
        require(matricula != null) { "La matrícula no puede ser nula." }
        require(color != null) {"El color no puede ser nulo."}
    }


    override fun toString(): String {
        return "*******INFOCOCHE*******" +
                "\nColor: $color" +
                "\nMarca: $marca" +
                "\nModelo: $modelo" +
                "\nNúmero de caballos: $numeroCaballos" +
                "\nNúmero de puertas: $numeroPuertas" +
                "\nMatrícula: $matricula" +
                "\n***********************"
    }

//    Modifica el atributo matricula para que no permita actualizar la matrícula con un valor que no tenga 7 caracteres.
//    Los atributos de modelo la marca siempre se devolverán con la primera letra en mayúscula.
//    Realiza también una modificación del atributo número de caballos, para que no permita actualizar el atributo numCaballos con un valor interior a 70, ni superior a 700.
//    Realiza una modificación del atributo número de puertas, para que no permita actualizar el atributo numPuertas con un valor inferior a 3, ni superior a 5.
//    Ten en cuenta todas estas condiciones a la hora de crear el constructor de la clase.
}


fun main() {
    try {
        val coche1 = Coche("rojo","asdf","asdf",87,4,123123)
        print(coche1)
    } catch (e: IllegalArgumentException) {
        println("*ERROR* ${e.message}")
    }

}