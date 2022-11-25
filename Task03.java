import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        int res;

        System.out.print("Введите действие '+' '-' '*' '/' ");
        String action = scan.nextLine();
        action = scan.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("error");
                } else {
                    res = num1 - num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Еще раз");
        }
    }
}



