package BaekJoon_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((b-45)<0){
            a = a-1;
            if(a<0) a = 23;
            b = b+60;
        }
        b = b-45;
        System.out.print(a+" "+b);
    }
}
