package SandBox.relfection_annotation_test;

import java.lang.reflect.Proxy;

public class ReflectionProxy {
    public static void main(String[] args) {

        ClassLoader classLoader = Name.class.getClassLoader();
        Class<?>[] interfaces = new Class<?>[] { Name.class };

        Name proxiedName = (Name) Proxy.newProxyInstance(classLoader, interfaces, new PrintFinishHandler(new NameImpl()));

        proxiedName.name("yeh");

    }
}
