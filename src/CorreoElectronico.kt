class CorreoElectronico(private val destinatario: String, private val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando correo electrónico a $destinatario: $mensaje")
    }
}