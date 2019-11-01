package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("輸入要1加到多少");
        int x = sc.nextInt();
        int sum = 0;
        for(int i = 1 ;i <=x;i++){
            sum +=i;
        }
        
        System.out.println("總和"+sum);

    }

}
