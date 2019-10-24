package java_homeworks.homework2;
import java.util.Scanner;
interface TestInterface{
    public void setValues();
    public void getRange();
    public void getDevisors();
    public void getPrimeDevisors();
    public String getMaxOccuringChar();
}

public class Third implements TestInterface {
    int a;
    int b;
    public void setValues(){
        Scanner MyObj = new Scanner(System.in);
        a = MyObj.nextInt();
        b = MyObj.nextInt();
        MyObj.close();
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
    public String getMaxOccuringChar() 
    { 
        int count[] = new int[256]; 
        String str = Integer.toString(b);
        System.out.println("THIS: " + str);
        int len = str.length(); 
        for (int i=0; i<len; i++) 
            count[str.charAt(i)]++; 
       
        int max = -1; 
        char result = ' ';
       
        // Traversing through the string and maintaining 
        // the count of each character 
        for (int i = 0; i < len; i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                result = str.charAt(i); 
            } 
        } 
        String res = String.valueOf(result);
        return res; 
    } 
}