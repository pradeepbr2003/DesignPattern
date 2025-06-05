package design.pattern.chainOfResponsibility.message;

public class LogDebug extends LogChain {

    public void logMessage(String message) {
        System.out.printf("%n DEBUG : %s %n", message);
    }
}
