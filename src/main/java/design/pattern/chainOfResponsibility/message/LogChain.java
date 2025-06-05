package design.pattern.chainOfResponsibility.message;

public abstract class LogChain implements LogInt {
    private LogInt nextLog;

    abstract void logMessage(String message);

    @Override
    public void setNextLog(LogInt nextLog) {
        this.nextLog = nextLog;
    }

    @Override
    public void log(String message) {
        this.logMessage(message);
        if (nextLog != null) {
            this.nextLog.log(message);
        }
    }
}
