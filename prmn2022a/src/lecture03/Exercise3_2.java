package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int line = scanner.nextInt();scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < line; i++){
            System.out.println(i+1+"行目:");
            String s = scanner.nextLine();
            list.add(s);
        }
        for(String s : list){
            System.out.println("["+list.indexOf(s)+"] "+s);
        }
    }
}
