package inheritanceandpolymorphism;

public class AlexaFrance extends Alexa {
    @Override
    public void greeting() {
        System.out.println("Bonjour!");
    }

    public void listen() {
        System.out.println("Listening...");
    }
}
