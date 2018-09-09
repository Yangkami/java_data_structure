package javabasis;

import java.util.Scanner;

public class Fibonacci {
 
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int n = scanner.nextInt(); // 假设输入为大于零的整数
 
        int i =1;
        int f = 0;
        while(true) {
            f = fibonacci(i);
            if(f == n) {
                System.out.println(n+"是斐波纳契数");
                break;
            }else if(f > n) {
                System.out.println(n+"不是是斐波纳契数");
                break;
            }
            i++;
        }
    }
 
    // 递归实现方式
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}