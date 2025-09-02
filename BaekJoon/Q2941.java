package BaekJoon;

import java.util.Scanner;

public class Q2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String val = sc.nextLine();

        int cnt = 0;

        for(int i = 0 ; i < val.length() ; i++) {
            char c = val.charAt(i);
            if (c == 'l' || c == 'n') { //크로아티아 알바펫으로 시작하면 앞자리 일단 검사
                if(i < val.length() - 1) {
                    if (val.charAt(i + 1) == 'j') { //크로아티아 알바펫인지 바로 뒷 문자 검사
                        cnt++;
                        i++; //그 단어 건너뛰기
                    } else {
                        cnt++;
                    }
                } else {
                    cnt++;
                }
            } else if (c == 'c') {
                if(i < val.length() - 1) {
                    if (val.charAt(i + 1) == '=' || val.charAt(i + 1) == '-') { //크로아티아 알바펫인지 바로 뒷 문자 검사
                        cnt++;
                        i++; //그 단어 건너뛰기
                    } else {
                        cnt++;
                    }
                } else {
                    cnt++;
                }
            } else if (c == 'd') {
                if(i < val.length() - 1) {
                    if (val.charAt(i + 1) == '-') { //크로아티아 알바펫인지 바로 뒷 문자 검사
                        cnt++;
                        i++; //그 단어 건너뛰기
                    } else if (i < val.length() - 2 && val.charAt(i + 1) == 'z' && val.charAt(i + 2) == '=') {
                        cnt++;
                        i++;
                        i++;
                    } else {
                        cnt++;
                    }
                } else {
                    cnt++;
                }
            } else if (c == 's' || c == 'z') { //크로아티아 알바펫으로 시작하면 앞자리 일단 검사
                if(i < val.length() - 1) {
                    if (val.charAt(i + 1) == '=') { //크로아티아 알바펫인지 바로 뒷 문자 검사
                        cnt++;
                        i++; //그 단어 건너뛰기
                    } else {
                        cnt++;
                    }
                } else {
                    cnt++;
                }
            } else {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
