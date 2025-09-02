package SandBox;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String a = "우와 신기하다";

        Method length = a.getClass().getMethod("length");

        System.out.println(length.getReturnType());
        int result = (int) length.invoke(a);
        System.out.println(result);
    }
}
