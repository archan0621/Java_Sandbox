package Algorithm;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonachiWithCache {

    public static void main(String[] args) {
        FiboCache instance = new FiboCache();

        System.out.println(instance.fibo(BigInteger.valueOf(100)));
    }
}

class FiboCache {

    Map<BigInteger, BigInteger> cache = new HashMap<>();

    public BigInteger fibo(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(2)) <= 0) {
            return BigInteger.ONE;
        }

        if (!cache.containsKey(n)) {
            BigInteger result = fibo(n.subtract(BigInteger.ONE))
                    .add(fibo(n.subtract(BigInteger.TWO)));
            cache.put(n, result);
        }

        return cache.get(n);
    }
}