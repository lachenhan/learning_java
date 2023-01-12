package chapter02;

public class java04_operator {
    public static void main(String[] args) {

    // 二元运算符
        System.out.println(1 + 2); //3
        System.out.println(4 - 4); // 0
        System.out.println( 4 / 2); // 2
        System.out.println( 5%3); // 2
        System.out.println(1/2);
        System.out.println(1.0/2);
        // Result of operation has type, it takes the greater type as type.
        // By default, the smallest type is int

        byte b1 = 10;
        byte b2 = 4;
        byte b3 = (byte)(b1 - b2);
        System.out.println(b3);

    // 一元运算符,先赋值后运算
    int i = 0;
    //int j = i;
    //i = i + 1;
    int j = i++;
    System.out.println("i = " + i);
    System.out.println("j = " + j);

    // 三元运算符 变量= (条件表达式)?(任意表达式1):(任意表达式2)
    // 若条件表达式结果为True,则执行任意表达式1, 反之则执行任意表达式2
    int x = 10;
    int result = (x != 10)? 1+1 : 2+2;
    System.out.println(result);


    }
    
}
