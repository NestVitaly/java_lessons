package first_dz;

import java.util.Scanner;

public class method {
    public static boolean Year(int year) {
        if (year % 4 != 0) {
            return false;
        }
        else if (year % 100 != 0) {
            return true;
        }
        else if (year % 400 != 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (Year(year)) {
            System.out.println(year + " - високосный!");
        }
        else {
            System.out.println(year + " - не високосный!");
        }
    }
}
