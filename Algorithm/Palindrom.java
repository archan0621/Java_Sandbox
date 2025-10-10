package Algorithm;

public class Palindrom {

    public static void main(String[] args) {
        Pal instance = new Pal();

        System.out.println(instance.pal("abcba".toCharArray(), 0));
        System.out.println(instance.pal("adfafasdf".toCharArray(), 0));
        System.out.println(instance.pal("소주만병만주소".toCharArray(), 0));
    }
}

class Pal {

    public boolean pal(char[] input, int index) {
        if(input.length % 2 == 0) return false;

        if(index == input.length / 2) return true;
        if (!(input[index] == input[input.length - 1 - index])) return false;

        return pal(input, index + 1);
    }
}
