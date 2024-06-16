package Formative;

public class Q4 {
    public static void main(String[] args) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int a = 0;
        a = cal.get ( java.util.Calendar.YEAR )-1900; // a = 124
        a += cal.get ( java.util.Calendar.MONTH ); // a = 129
        a += cal.get ( java.util.Calendar.DATE ) ; //a = 145

        System.out.printf("%d %d %d ", 124, 129, 145);
    }
}