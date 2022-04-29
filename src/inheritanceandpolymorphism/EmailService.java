package inheritanceandpolymorphism;

abstract class NotificationService {
    private String message;

    public NotificationService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    abstract String sendNotification();
}


public class EmailService extends NotificationService {
    private String email;

    public EmailService(String message, String email) {
        super(message);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String sendNotification() {
        String notification = "";
        notification += "Email sent to: " + this.getEmail();
        notification += " with message: " + this.getMessage();
        return notification;
    }
}