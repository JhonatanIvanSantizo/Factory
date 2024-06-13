package factory_abstract;

public class UrgenteNotificacionFactory implements NotificacionFactory {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new UrgenteEmailNotificacion();
    }
    @Override
    public Notificacion crearSMSNotificacion() {
        return new UrgenteSMSNotificacion();
    }
    @Override
    public Notificacion crearAppNotificacion() {
        return new UrgenteAppNotificacion();
    }
}
