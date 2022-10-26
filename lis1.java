//A=﹁( p v q ) ^ ( (p v r) v s)

package lisan1;

import java.util.Scanner;

public class lis1 {
    public static void main(String[] args) {
        int p, r, q, s;
        System.out.println("请输入q, p, r, s的真假值，使用0/1表述并用空格分开：");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        q = sc.nextInt();
        r = sc.nextInt();
        s = sc.nextInt();
        System.out.println("真值为：" + calc(p, q, r, s));
        display();
    }

    public static boolean calc(int p, int q, int r, int s) {
        int temp1, temp2;
        if (p + q + r + s > 4) {
            System.out.println("输入结果格式化为1111");
        }
        if (p == 0 && q == 0) {
            temp1 = 0;
        } else {
            temp1 = 1;
        }
        temp1 = temp1 ^ 1;
        if (p != 0 || r != 0) {
            temp2 = 1;
        } else {
            temp2 = 0;
        }
        if (temp1 == 1 && temp2 == 1) {
            return true;
        } else {
            return false;
        }
    }









    public static void display(){
        int p,q,r,s;
        System.out.println("\n以下输出真值表");
        System.out.println("P\tQ\tR\tS\t结果");
        System.out.println("0\t0\t0\t0\t" + calc(p = 0, q = 0, r = 0, s = 0));
        System.out.println("1\t0\t0\t0\t" + calc(p = 1, q = 0, r = 0, s = 0));
        System.out.println("0\t1\t0\t0\t" + calc(p = 0, q = 1, r = 0, s = 0));
        System.out.println("1\t1\t0\t0\t" + calc(p = 1, q = 1, r = 0, s = 0));
        System.out.println("0\t0\t1\t0\t" + calc(p = 0, q = 0, r = 1, s = 0));
        System.out.println("1\t0\t1\t0\t" + calc(p = 1, q = 0, r = 1, s = 0));
        System.out.println("0\t1\t1\t0\t" + calc(p = 0, q = 1, r = 1, s = 0));
        System.out.println("1\t1\t1\t0\t" + calc(p = 1, q = 1, r = 1, s = 0));
        System.out.println("0\t0\t0\t1\t" + calc(p = 0, q = 0, r = 0, s = 1));
        System.out.println("1\t0\t0\t1\t" + calc(p = 1, q = 0, r = 0, s = 1));
        System.out.println("0\t1\t0\t1\t" + calc(p = 0, q = 1, r = 0, s = 1));
        System.out.println("1\t1\t0\t1\t" + calc(p = 1, q = 1, r = 0, s = 1));
        System.out.println("0\t0\t1\t1\t" + calc(p = 0, q = 0, r = 1, s = 1));
        System.out.println("1\t0\t1\t1\t" + calc(p = 1, q = 0, r = 1, s = 1));
        System.out.println("0\t1\t1\t1\t" + calc(p = 0, q = 1, r = 1, s = 1));
        System.out.println("1\t1\t1\t1\t" + calc(p = 1, q = 1, r = 1, s = 0));
    }
}
