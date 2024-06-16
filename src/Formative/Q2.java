package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double num1 = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());
        double num3 = Double.parseDouble(st.nextToken());
        int subjectCount = 3;

        int sum = (int) num1 + (int) num2 + (int) num3;
        int avg = (int) ((num1 + num2 + num3) / subjectCount);

        System.out.printf("sum %d\n", sum);
        System.out.printf("avg %d", avg);
    }
}