package design.pattern.chainOfResponsibility.message;

public class LogError extends LogChain {
    public void logMessage(String message) {
        System.out.printf("%n ERROR : %s %n", message);
    }
}
