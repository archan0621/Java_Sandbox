package SandBox;

import java.util.Scanner;

public class KoreanNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("한국어 이름을 입력하세요: ");
        String koreanName = scanner.next();

        // 입력받은 한글 이름을 초성, 중성, 종성으로 분리하여 출력
        for (char c : koreanName.toCharArray()) {
            // 한글 유니코드 범위 확인
            if (isHangul(c)) {
                // 한글 자모 분리
                char[] separated = separateHangul(c);

                // 초성, 중성, 종성 출력
                System.out.println("초성: " + separated[0] + ", 중성: " + separated[1] + ", 종성: " + separated[2]);
            } else {
                // 다른 문자는 그대로 출력
                System.out.println("초성: " + c + ", 중성: , 종성: ");
            }
        }
    }

    // 한글 여부 확인
    private static boolean isHangul(char c) {
        return c >= 0xAC00 && c <= 0xD7A3;
    }

    // 한글 자모 분리
    private static char[] separateHangul(char c) {
        int base = c - 0xAC00;
        int jongseong = base % 28;
        int joongseong = ((base - jongseong) / 28) % 21;
        int choseong = (((base - jongseong) / 28) - joongseong) / 21;

        char[] result = new char[3];
        result[0] = (char) (choseong + 0x1100);
        result[1] = (char) (joongseong + 0x1161);
        result[2] = (char) (jongseong + 0x11A7);

        return result;
    }
}
