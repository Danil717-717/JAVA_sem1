// ��������� n-�� ������������ ����� (����� ����� �� 1 �� n), n! (������������ ����� �� 1 �� n)

import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("������� �����: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0;i <= n; i++) {
            sum = sum + i;
        }
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        //System.out.print("����� ����� �� 1 �� " + n + " - " + sum);
        System.out.printf("����� ����� �� 1 �� %d - %d", n, sum);
        System.out.printf("\n������������ ����� �� 1 �� %d - %d", n, mult);

    }
}