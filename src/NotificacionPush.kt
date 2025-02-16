class NotificacionPush(private val dispositivoId: String, private val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando notificación push al dispositivo $dispositivoId: $mensaje")
    }
}