package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1つ目の整数を入力してください:");
        String s1 = scanner.nextLine();
        int num1 = Integer.parseInt(s1);

        System.out.println("2つ目の整数を入力してください:");
        String s2 = scanner.nextLine();
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;
        System.out.println(num1+ " + " +num2+ " = " +sum);
    }
}
