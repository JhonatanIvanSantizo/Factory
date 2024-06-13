package factory;

public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo){
        if(tipo.equals("Email")){
            return new EmailNotificacion();
        }else if(tipo.equals("SMS")){
            return new SMSNotificacion();
        }else if(tipo.equals("App")){
            return new AppNotificacion();
        }else{
            throw new IllegalArgumentException("Tipo no valido");
        }
    }
}
