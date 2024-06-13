package factory_abstract;

public class RegularSMSNotificacion implements Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS regular: "+mensaje);
    }
}
