import java.util.*;
class QuotientReminder {
        public static void main(String arg[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the divisior: ");
        int div = sc.nextInt();
        int Q = n / div;
        int R = n % div;
        System.out.println("Quotient is: " +Q);
        System.out.println("Reminder is: " +R);
        }
}