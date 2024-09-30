//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenNumbers = 0;
        int count = 0;

        while (count < 10) {
            count++;
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evenNumbers++;

            }
        }
        System.out.println("There are " + evenNumbers + " even numbers");
    }

}
