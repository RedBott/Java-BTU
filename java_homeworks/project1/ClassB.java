package java_homeworks.project1;
import java.util.Scanner;
/**
 * ClassB
 */
public class ClassB {
    int a,b,c;
    public void methodOne(){
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Enter values for a, b and c");
        a = MyObj.nextInt();
        b = MyObj.nextInt();
        c = MyObj.nextInt();
        MyObj.close();
    }
    public void methodTwo(){
            
    }
    public void methodThree(){
    }
}