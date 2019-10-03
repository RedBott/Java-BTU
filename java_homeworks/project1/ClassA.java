package java_homeworks.project1;
import java.util.Scanner;

/**
 * ClassA
 */
public class ClassA {
    int a,b;
    public void methodOne(){
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Enter values for a and b");
        a = MyObj.nextInt();
        b = MyObj.nextInt();
        MyObj.close();
    }
    public void methodTwo(){
        int sum = a+b;
        System.out.println(sum);
    }
    public int methodThree(){
        return a + b;
    }
}