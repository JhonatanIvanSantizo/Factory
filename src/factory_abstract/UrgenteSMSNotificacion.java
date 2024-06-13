package factory_abstract;

public class UrgenteSMSNotificacion implements Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS urgernte: "+mensaje);
    }
}
