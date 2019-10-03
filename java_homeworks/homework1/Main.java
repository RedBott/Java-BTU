package java_homeworks.homework1;
import java.util.*;
/**
 * Homework_1
 */
public class Main {
        public static void main(String[] args) {
            ClassC TestC = new ClassC();
            TestC.methodOne();
            TestC.methodTwo();
            TestC.methodThree();
            TestC.methodFour();
            TestC.methodFive();
            TestC.methodSix();
            ClassA TestA = new ClassA();
            TestA.methodOne();
            TestA.methodTwo();
            TestA.methodThree();
            ClassB TestB = new ClassB();
            TestB.methodOne();
            TestB.methodTwo();
            Task3();
        }
        public static void Task3(){
            int a,b;
            Scanner MyObj = new Scanner(System.in);
            a = MyObj.nextInt();
            b = MyObj.nextInt();
            MyObj.close();
            if(a>b){
                int temp;
                temp = a;
                a = b;
                b = temp;
            }
            int oddCount=0;
            int oddSum = 0;
            int evenCount = 0;
            int evenSum = 0;
            Random random = new Random();
            for(int i=0;i<40;i++){
                int randomNumber  = random.nextInt((b - a) + 1) + a;
                System.out.println(randomNumber);
                if(randomNumber%2==1){
                    oddCount+=1;
                    oddSum+=randomNumber;
                }
                else{
                    evenCount+=1;
                    evenSum+=1;
                }
            }
            System.out.println("There were " + evenCount + " even numbers,with sum of "+ evenSum + " ;" + oddCount + " odd numbers,with sum of " + oddSum + " ;");
            if(evenSum>oddSum){
                int temp = evenSum;
                evenSum = oddSum;
                oddSum = temp;
            }
            for(int k=0;k<5;k++){
                System.out.println(random.nextInt((oddSum - evenSum) + 1) + evenSum);
            }
        }
}