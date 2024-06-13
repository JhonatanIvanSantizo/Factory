package factory_abstract;

public interface NotificacionFactory {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}
