import factory.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion emailNotificacion = factory.crearNotificacion("Email");
        emailNotificacion.enviarMensaje("Hola");

        Notificacion smsNotificacion = factory.crearNotificacion("SMS");
        smsNotificacion.enviarMensaje("Hola");

        Notificacion appNotificacion = factory.crearNotificacion("App");
        appNotificacion.enviarMensaje("Hola");
    }
}