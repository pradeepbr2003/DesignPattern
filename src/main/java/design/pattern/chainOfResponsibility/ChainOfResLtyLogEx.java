package design.pattern.chainOfResponsibility;

import design.pattern.chainOfResponsibility.message.LogDebug;
import design.pattern.chainOfResponsibility.message.LogError;
import design.pattern.chainOfResponsibility.message.LogInfo;
import design.pattern.chainOfResponsibility.message.LogInt;

public class ChainOfResLtyLogEx {
    public static void main(String[] args) {
        LogInt logError = new LogError();
        LogInt logInfo = new LogInfo();
        LogInt logDebug = new LogDebug();

        logDebug.setNextLog(logInfo);
        logInfo.setNextLog(logError);

        logDebug.log("Example of chain of responsibility");

    }
}
