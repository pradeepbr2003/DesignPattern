package design.pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DesignPattern {
    public static void main(String[] args) {
        Class<?> cls = IDesignPattern.class;
        for (Method method : cls.getDeclaredMethods()) {
            try {
                method.invoke(null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.printf("%n %s %n", e.getMessage());
            }
        }
    }
}
