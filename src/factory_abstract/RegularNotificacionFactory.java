package factory_abstract;

public class RegularNotificacionFactory implements NotificacionFactory {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new RegularEmailNotificacion();
    }
    @Override
    public Notificacion crearSMSNotificacion() {
        return new RegularSMSNotificacion();
    }
    @Override
    public Notificacion crearAppNotificacion() {
        return new RegularAppNotificacion();
    }
}
