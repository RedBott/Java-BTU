package java_homeworks.homework1;
import java.util.*;

/**
 * ClassA
 */
public class ClassA {
    int x;
    public ClassA(){
        System.out.println("Hello");
    }
    public void methodOne(){
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Enter value for X");
        x = MyObj.nextInt();
        MyObj.close();
    }
    public void methodTwo(){
        System.out.println(x + 12);
    }
    public void methodThree(){
        if(x%2==1){
            System.out.println("Odd Number");
        }
        else{
            System.out.print("Even Number");
        }
    }
}