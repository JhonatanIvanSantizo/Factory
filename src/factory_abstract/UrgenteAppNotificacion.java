package factory_abstract;

public class UrgenteAppNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("App mensaje urgente: " + mensaje);
    }
}
