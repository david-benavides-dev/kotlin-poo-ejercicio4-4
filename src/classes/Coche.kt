package classes
import java.util.*


class Coche(color: String, marca: String, modelo: String, numCaballos: Int, numeroPuertas: Int, matricula: String) {

    var color: String? = color
        set(value) {
            require(!value.isNullOrBlank()) { "El color no puede estar vacío." }
            field = value
        }


    var modelo: String? = modelo.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            require(!value.isNullOrBlank()) { "El modelo no puede estar en blanco." }
            field = value
        }


    var marca: String? = marca.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            require(!value.isNullOrBlank()) { "La marca no puede estar en blanco." }
            field = value
        }


    var numCaballos: Int? = numCaballos
        set(value) {
            require(value in 70..700) { "El número de caballos debe estar entre 70 y 700." }
            field = value
        }


    var numeroPuertas: Int? = numeroPuertas
        set(value) {
            require(value in 3..5) { "El coche debe tener un mínimo de tres y un máximo de cinco puertas. " }
            field = value
        }


    var matricula: String? = matricula
        set(value) {
            require(!value.isNullOrBlank()) { "La marca no puede estar en blanco." }
            require(value.length == 7) { "La matrícula tiene que tener exactamente 7 caracteres." }
            field = value
        }


    init {
        require(modelo.isNotEmpty()) { "El modelo no puede estar en blanco." }
        require(marca.isNotBlank()) { "La marca no puede estar en blanco." }
        require(matricula.isNotBlank() && matricula.length == 7) { "La matrícula no puede ser nula o tener menos de siete caracteres." }
        require(numeroPuertas > 0) { "El número de puertas no puede ser nulo." }
        require(numCaballos > 0) { "El número de caballos debe ser mayor que 0." }
        require(color.isNotBlank()) { "El color no puede ser nulo." }
    }


    override fun toString(): String {
        return "*******INFOCOCHE*******" +
                "\nColor: $color" +
                "\nMarca: $marca" +
                "\nModelo: $modelo" +
                "\nNúmero de caballos: $numCaballos" +
                "\nNúmero de puertas: $numeroPuertas" +
                "\nMatrícula: $matricula" +
                "\n***********************"
    }
}