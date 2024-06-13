//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import factory_abstract.*;
public class Main {
    public static void main(String[] args) {
        NotificacionFactory urgenteFactory = new UrgenteNotificacionFactory();

        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("Hola!");

        Notificacion urgenteSMS = urgenteFactory.crearSMSNotificacion();
        urgenteSMS.enviarMensaje("Hola!");

        Notificacion urgenteApp = urgenteFactory.crearAppNotificacion();
        urgenteApp.enviarMensaje("Hola!");

        NotificacionFactory regularFactory = new RegularNotificacionFactory();

        Notificacion regularEmail = regularFactory.crearEmailNotificacion();
        regularEmail.enviarMensaje("Hola...");

        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Hola...");

        Notificacion regularApp = regularFactory.crearAppNotificacion();
        regularApp.enviarMensaje("Hola...");
    }
}