package inflearn.codeTest;

public class Q0806 {

    static int n;
    static int[] ch;

    public void DFS(int L) {

        if (L == n + 1) {

            for(int i = 0 ; i < n + 1 ; i++) {
                if(ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();

        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }

    }

    public static void main(String[] args) {

        Q0806 T = new Q0806();

        n = 3;
        ch = new int[n + 1];

        T.DFS(1);

    }
}
