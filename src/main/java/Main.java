import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Franklyn! Occupation: Software Engineer" + "Enter your success code: ");

        //First test Condition
        int x = 2;
        x -= 1;// x becomes 1 after subtracting one to two.
        int y = 3 + x;//3+1 is passed on to y. so y is 4;
        int z = y;//Whatever is y is now z also.
        int sum = z + y;//if z =4 && y is = 4; Then sum is 8


        //if sum is 8 and is equals to 8 then do z else do y. This case is passing z. First condition.
//        sum = (sum == sum) ? z : y;

        //Second test condition(c == a)
        //if a = c b && b == c; then c == a;
        int a = 100;
        int b = 200;
        a = b;//a == 200 because b(200) is being assigned to a
        int c = b;
        c = 300;
        z = 1000;
        int myNum = sc.nextInt();//output: my number input and stores it to myNum

        //Third test Condition
        System.out.println("Check this out: "  + (c = ((c == a || c == c) ? c : ((a==a)? a : b))));

        //Fourth test Condition;
        //c == a false || c == c true therefore, prints output 1000 + myNum input.

        System.out.println("Engineer test Condition: " + ((c == a || c == b)? c: ((a == a)? z + myNum : z)));
        System.out.println( ((c == a || c == b)? c: ((a == a)? ("Engineering success code : " + (myNum + z)) : myNum * z)));

        System.out.println((myNum%2==1 || (myNum>=6 && myNum<=20)) ? "Success code is an Odd Num " : ((myNum>=2 && myNum <=5) || myNum > 20) ? "Success code is an Even Num" : "Success code is an Odd Num");


//Fourth test Condition;
        //if c == a T/F
        System.out.println(c);
        System.out.println(sum);
    }
}
