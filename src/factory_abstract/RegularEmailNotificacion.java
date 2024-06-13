package factory_abstract;

public class RegularEmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Email regular: "+mensaje);
    }
}
