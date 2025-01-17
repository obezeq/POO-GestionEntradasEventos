class Usuario(
    val nombre: String,
    val dni: String,
    val email: String
) {
    companion object {
        private const val MAXIMO_PERMITIDO = 6
    }

	fun validarEmail(email: String): Boolean {
		//TODO: hacerlo
		return true
	}

	fun validarDni(dni: String): Boolean {
		//TODO: hacerlo
		return true
	}

    val entradas = mutableMapOf<Evento, MutableList<Entrada>>()

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
        require(validarEmail(email)) { "El email tiene un formato inválido." }
        require(validarDni(dni)) { "El dni tiene un formato inválido" }
    }

    fun comprarEntradas(evento: Evento, cantidad: Int): Boolean {
		//TODO: Validar si el usuario puede comprar la cantidad de entradas... sino => mensaje de error y return false

		//TODO: Pedir al evento la venta de las entradas
		// Si retorna null mensaje de error y return false

		//TODO: Si llega a este punto, se supone que el evento me 
		//      ha vendido y retornado una lista de entradas.
		//      Las agregamos a la lista de entradas del evento.
        return true
    }

    override fun toString(): String {
        return "Usuario(nombre=$nombre, dni=$dni, email=$email, entradas=$entradas)"
    }
}
