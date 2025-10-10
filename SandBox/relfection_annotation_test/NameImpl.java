package SandBox.relfection_annotation_test;

public class NameImpl implements Name {
    @Override
    public void name(String a) {
        System.out.println(a);
    }
}
