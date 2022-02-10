import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] alpha = new int[26];

        for (int i = 0; i < n; i++) {
            String str = kb.next();
            int len = str.length();

            for (int j = 0; j < len; j++) {
                int idx = str.charAt(j) - 65;
                int num = (int)Math.pow(10, len -1 - j);

                alpha[idx] += num;
            }
        }

        Arrays.sort(alpha);
        int answer = 0;

        for (int i = 25; i > 16; i--) {
            answer += (alpha[i] * (i - 16));
        }
        System.out.println(answer);
    }

}