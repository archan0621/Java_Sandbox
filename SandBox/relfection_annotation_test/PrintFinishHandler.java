package SandBox.relfection_annotation_test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PrintFinishHandler implements InvocationHandler {

    Object target;

    public PrintFinishHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        System.out.println("this is print finisher");
        return result;
    }
}