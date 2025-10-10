package Algorithm;

public class Factorial {
    public static void main(String[] args) {
        Fact instance = new Fact();
        System.out.println(instance.fact(4));
    }
}

class Fact {
    public int fact(int n) {
        if( n == 1 ) return 1;
        return fact(n-1) * n;
    }
}

