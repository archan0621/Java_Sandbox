package SandBox;

import java.io.*;

class User implements Serializable {
    private String name;
    private transient String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return "name=" + name + ", password=" + password;
    }
}

public class TransientTest {
    public static void main(String[] args) throws Exception {
        User user = new User("홍길동", "1234");

        // 직렬화
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();

        // 역직렬화
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User deserialized = (User) ois.readObject();
        ois.close();

        System.out.println(deserialized); // password=null 출력됨
    }
}