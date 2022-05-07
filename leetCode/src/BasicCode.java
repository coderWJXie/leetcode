import java.util.Scanner;
// 测试类
// 必须包含main函数
// 类名必须与文件名一致
// 建议一个文件只写一个类
public class BasicCode {
    public static void main(String[] args) {
        BasicCode basicCode = new BasicCode();
        basicCode.myPow(10);
        basicCode.getXing();
        basicCode.multiplyTable();
    }

    // 使用递归法 - 计算N的阶乘
    public int myPow(int n) {
        // N! = N * (N - 1) * (N - 2) * ... * 2 * 1
        // 1.必须与结束条件
        if (n == 1) {
            return 1;
        }
        // 2.必须自己调用自己
        return n * myPow(n - 1);
        /*
        // 使用递归法
        n个人坐在一起：
        1、问第n个人多大，他说比第(n - 1)个人大2岁；.....问第5个人多大，他说比第4个人大2岁；
        2、问第4个人多大，他说比第3个人大2岁；问第3个人多大，他说比第2个人大2岁；问第2个人多大，
        3、他说比第1个人大2岁；问第1个人多大，他说10岁；请问第n个人多少岁？
        */
        /**
        if (n == 1) {
            return 10;
        }
        return myPow(n - 1) + 2;
        */
    }

    // 输出"*"
    public void getXing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数");
        int x = scanner.nextInt();
        System.out.println("请输入列数");
        int y = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // 九九乘法表
    public void multiplyTable() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < (i + 1); j++) {
                // \t - 制表符 - 表示点击一个tab键
                // \n - 换行符
                System.out.print((j + 1) + "*" + (i + 1) + "=" + (j + 1) * (i + 1) + "\t");
                if (j == i) {
                    System.out.print("\n");
                }
            }
        }
    }
}