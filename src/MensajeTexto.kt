class MensajeTexto(private val numero: String, private val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando SMS al número $numero: $mensaje")
    }
}