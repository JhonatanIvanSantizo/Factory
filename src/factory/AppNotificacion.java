package factory;

public class AppNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje){
        System.out.println("Enviando notificacion por App: " + mensaje);
    }
}
