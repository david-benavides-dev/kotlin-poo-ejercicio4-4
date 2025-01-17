////package classes
//
//// Constructor primario
//class Coche(var color: String, var marca: String, var modelo: String, var numeroCaballos: Int, var numeroPuertas: Int, var matricula: Int) {
////    Crear una clase Coche, a través de la cual se pueda conocer el
////    color del coche, la marca, el modelo, el número de caballos, el número de puertas y
////    la matrícula. Crear el constructor del coche, así como el métod toString().
////
////    Número de caballos, número de puertas y matrícula no podrán modificarse, ni podrán ser nulos.
////    Color podrá modificarse, pero no podrá ser nulo.
//
//    init {
//        // Marca y modelo no podrán ser blancos ni nulos y no podrán modificarse.
//        require(modelo.isNotEmpty() || modelo != null) { "El modelo no puede estar en blanco." }
//        require(marca.isNotBlank() || modelo != null) { "La marca no puede estar en blanco." }
//    }
//
//
//    override fun toString(): String {
//        return "***********************" +
//                "Color: $color" +
//                "Marca: $marca" +
//                "Modelo: $modelo" +
//                "Número de caballos: $numeroCaballos" +
//                "Número de puertas: $numeroPuertas" +
//                "Matrícula: $matricula" +
//                "***********************"
//    }
//}