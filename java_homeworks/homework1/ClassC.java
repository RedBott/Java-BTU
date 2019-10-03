package java_homeworks.homework1;
import java.util.Scanner;
import java.lang.*;
/**
 * ClassC
 */
public class ClassC {
    int a,b,c;
    public void methodOne(){
        Scanner MyObj = new Scanner(System.in);
        a = MyObj.nextInt();
        b = MyObj.nextInt();
        c = MyObj.nextInt();
        MyObj.close();      
    }
    public int methodTwo(){
        return a%10;
    }
    public int methodThree(){
        int length = String.valueOf(b).length();
        return b/(10*length);
    }
    public int methodFour(){
        int sum = 0;
        while(c!=0){
            sum += c%10;
            c = c/10;
        }
        return sum;
    }
    public int methodFive(){
        int result = methodTwo()*methodThree();
        System.out.println(result);
        return result;
    }
    public void methodSix(){
        System.out.println(methodThree()+methodFive());
    }
}