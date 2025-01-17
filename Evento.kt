class Evento private constructor(
    val id: Int,
    val nombre: String,
    val ciudad: CiudadesValidas,
    val capacidad: Int,
    val precio: Double
) {
    var entradasVendidas: Int = 0
        private set

    fun venderEntradas(cantidad: Int): List<Entrada>? {
		//TODO: Comprobar si el evento puede venderme esa
		//      cantidad de entradas... sino => return null

        if (entradasVendidas + cantidad > capacidad) {
            println("No hay suficientes entradas disponibles. Quedan ${capacidad - entradasVendidas} entradas.")
            return null
        }

		//TODO: Si llega aquí es que puede venderlas...
		//      crear una lista de entradas, preguntando
		//      por cada entrada el nombre de la persona
		//      que va a entrar con esa entrada.

        val entradas = mutableListOf<Entrada>()

        for (i in 1..cantidad) {
            print("- Introduce el nombre de la entrada ${i}: ")
            val nombreEntrada = readln().trim()
            require(nombreEntrada.isNotBlank()) { "El nombre no puede estar vacío." }

            entradas.add(Entrada(++entradasVendidas, nombreEntrada))
        }

        return entradas

    }

    override fun toString(): String {
        return "Evento(id=$id, nombre=$nombre, ciudad=$ciudad, capacidad=$capacidad, precio=$precio, entradasVendidas=$entradasVendidas)"
    }
}