package lisan1;

import java.util.*;

public class lis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t \t真值表");
        System.out.println("p\tq\tr\ts\t结果");
        System.out.println("—————————————————————");
        int p, q, r, s;
        for (p = 0; p <= 1; p++) {
            for (q = 0; q <= 1; q++) {
                for (r = 0; r <= 1; r++) {
                    for (s = 0; s <= 1; s++) {
                        System.out.println(p + "\t" + q + "\t" + r + "\t" + s + "\t" + calc(p, q, r, s));
                    }
                }
            }
        }
        System.out.println("请输入p/q/r/s对应的值：");
        p = sc.nextInt();
        q = sc.nextInt();
        r = sc.nextInt();
        s = sc.nextInt();
        System.out.println("结果为："+calc(p,q,r,s));
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
}
