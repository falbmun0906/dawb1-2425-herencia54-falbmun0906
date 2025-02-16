fun main() {
    val notificaciones: MutableList<Notificable> = mutableListOf(
        CorreoElectronico("fran@daw1b.com", "Este es un correo electrónico de prueba."),
        MensajeTexto("687458349", "Este es un SMS de prueba."),
        NotificacionPush("ID78gad7834jo2405p", "Esta es una notificación push de prueba.")
    )

    println("IMPRIMIENDO NOTIFICACIONES:")

    for (canal in notificaciones) {
        canal.enviarNotificacion()
    }

}