package java_homeworks.homework2;
import java.util.Scanner;

public class Third {
    int a;
    int b;
    public void setValues(){
        Scanner MyObj = new Scanner(System.in);
        a = MyObj.nextInt();
        b = MyObj.nextInt();
    }
    public void getRange(){
        for(int i=a;i<b;i++){
            System.out.println(i);
        }
    }
    public  void getDevisors(){
        for(int i=1;i<a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
    public boolean isPrime(int n) {
        for(int i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void getPrimeDevisors(){
        for(int i=1;i<b;i++){
            if(b%i==0&&isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public int getMostCommonChar(){
        String str = String.valueOf(b);
        int a[] = new int[10];
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                a[i]++;
            }
        }
        max = 0
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
              max=a[i]
            }
        }
        return max;
    }
}