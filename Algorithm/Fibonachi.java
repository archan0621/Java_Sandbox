package Algorithm;

public class Fibonachi {
    public static void main(String[] args) {

        Fibo instance = new Fibo();

        System.out.println(instance.fibo(8));
    }
}

class Fibo {

    public int fibo(int n) {
        if(n <= 2) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}