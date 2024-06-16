package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int divisorInt = 4;
        double divisorDouble = 4.0;

        int intQuotient = input / divisorInt;
        double doubleQuotient = input / divisorDouble;

        System.out.printf("%d / %d = %d\n", input, divisorInt, intQuotient);
        System.out.printf("%d / %.1f = %.2f", input, divisorDouble, doubleQuotient);
    }
}
