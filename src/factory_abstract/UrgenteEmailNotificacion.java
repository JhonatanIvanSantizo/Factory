package factory_abstract;

public class UrgenteEmailNotificacion implements Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Email urgente: "+mensaje);
    }
}
