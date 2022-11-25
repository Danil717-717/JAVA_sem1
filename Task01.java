// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0;i <= n; i++) {
            sum = sum + i;
        }
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        //System.out.print("Сумма чисел от 1 до " + n + " - " + sum);
        System.out.printf("Сумма чисел от 1 до %d - %d", n, sum);
        System.out.printf("\nПроизведение чисел от 1 до %d - %d", n, mult);

    }
}