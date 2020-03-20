import java.util.Scanner;

public class show {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. ve hinh chu nhat");
            System.out.println("2. ve hinh tam giac vuong bot-left ");
            System.out.println("3. ve hinh tam giac vuong top-left ");
            System.out.println("4. ve hinh tam giac vuong bot-right ");
            System.out.println("5. ve hinh tam giac vuong top-right ");
            System.out.println("6. ve hinh tam giac can ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (i = 1; i <= 3; i++) {
                        for (j = 1; j <= 9; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (i = 1; i < 6; i++) {
                        for (j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (i = 1; i < 6; i++) {
                        for (j = 5; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (i = 1; i < 6; i++) {
                        for (j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (i = 1; i < 6; i++) {
                        for (j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (j = 6; i < j; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chua lua chon");
            }
        }
    }
}