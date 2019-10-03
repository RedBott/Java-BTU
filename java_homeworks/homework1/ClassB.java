package java_homeworks.homework1;
import java.util.*;

/**
 * ClassB
 */
public class ClassB extends ClassA {
    int y;
    public void methodOne(){
        Scanner MyObj = new Scanner(System.in);
        y = MyObj.nextInt();
        MyObj.close();
    }
    public int methodTwo() {
        return x + y;
    }
}