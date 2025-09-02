package SandBox;

public class StringConstantPoolTest {
    public static void main(String[] args) {

        String a1 = new String("a");
        String a2 = new String("a");

        String b1 = "b";
        String b2 = "b";

        if (a1 == a2) {
            System.out.println("a1 identityHashCode: " + System.identityHashCode(a1));
            System.out.println("a2 identityHashCode: " + System.identityHashCode(a2));
            System.out.println("a1과 a2는 같다");
        } else {
            System.out.println("a1 identityHashCode: " + System.identityHashCode(a1));
            System.out.println("a2 identityHashCode: " + System.identityHashCode(a2));
            System.out.println("a1과 a2는 다르다");
        }

        if (b1 == b2) {
            System.out.println("b1 identityHashCode: " + System.identityHashCode(b1));
            System.out.println("b2 identityHashCode: " + System.identityHashCode(b2));
            System.out.println("b1과 b2는 같다");
        } else {
            System.out.println("b1 identityHashCode: " + System.identityHashCode(b1));
            System.out.println("b2 identityHashCode: " + System.identityHashCode(b2));
            System.out.println("b1과 b2는 다르다");
        }

    }
}
