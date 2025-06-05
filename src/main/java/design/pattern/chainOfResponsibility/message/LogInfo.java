package design.pattern.chainOfResponsibility.message;

public class LogInfo extends LogChain {

    public void logMessage(String message) {
        System.out.printf("%n INFO : %s %n", message);
    }
}