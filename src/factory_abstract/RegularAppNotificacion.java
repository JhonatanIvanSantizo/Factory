package factory_abstract;

public class RegularAppNotificacion implements Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("App mensaje regular: "+mensaje);
    }
}
