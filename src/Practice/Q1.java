package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double num1 = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());

        int sum1 = (int) (num1 + num2);
        int sum2 = (int) num1 + (int) num2;

        System.out.printf("%d %d", sum1, sum2);
    }
}
