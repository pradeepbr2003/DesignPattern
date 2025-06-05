package design.pattern.chainOfResponsibility.message;

public interface LogInt {
    void log(String message);

    void setNextLog(LogInt nextLog);
}
