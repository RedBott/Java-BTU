import java.util.*;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    //first();
    //second();
    //third();
    //forth();
    //fifth();
    //seventh();
    //eightth();
    ninth();
  }
  public static void first(){
    String[] languages = {"C++","C#","Java","Pascal","PHP","Javascript","ActionScript"};
    for (String i : languages){
      System.out.println(i);
    }
  }
  public static void second(){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    System.out.println(n/m);
    System.out.println(m%n);
    input.close();
  }
  public static void third(){
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();
    System.out.println(x+y+z);
    System.out.println(x*y*z);
    input.close();
  }
  public static void forth(){
    Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    int[] ans = new int[3];
    int i = 0,x;
    while(m!=0){
      ans[i] = m%10;
      m /= 10;
      i++;
    }
    for(i=2;i>=0;i--){
      x=ans[i];
      System.out.println(x);
    }
    input.close();
  }
  public static void fifth(){
    Scanner input = new Scanner(System.in);
    String number = input.next();
    char arr[] = number.toCharArray();
    int ans = 0;
    for(char c: arr){
      int n = c - '0';
      ans += n;
    }
    System.out.println(ans);
    input.close();
  }
  //მუშაობს მეექვსე დავალბისთვისაც.
  public static void seventh(){
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int gcd = 1;
    for(int i = 1; i <= num1 && i <= num2; i++){
      if(num1%i==0 && num2%i==0){gcd = i;}
    }
    System.out.println("GCD of given numbers is :: " + gcd);
    int max,step, lcm = 0;
    if(num1 > num2){
      max = step = num1;
    }
    else{
      max = step = num2;
    }
    while(num1!= 0) {
    if(max % num1 == 0 && max % num2 == 0) {
      lcm = max;
      break;
    }
    max += step;
    }
    System.out.println("LCM of given numbers is :: "+lcm);
    input.close();
  }
  public static void eightth(){
  Scanner input = new Scanner(System.in);
  int M = input.nextInt();
  int N = input.nextInt();
  int i;
  for(i=M;i<N;i++){
    System.out.println(i);
  }
  }
  public static void ninth(){
    Random random = new Random();
    int[] arr = new int[8];
    for(int i=0;i<8;i++){
    int randomInt = random.nextInt();
    arr[i] = randomInt;
    }
    //mecxre, masivis elementebi,maximumi da minimumi.
    for(int i=0;i<arr.length;i++){
      int x = arr[i];
      System.out.println(x);
    }
    int max = 0;
    for(int i=0;i<arr.length;i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println("Maximum ::" + max);
    int min = arr[1];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    System.out.println("Minimum ::" + min);
    int temp;
    for (int i = 1; i < arr.length; i++) {
       for (int j = i; j > 0; j--){
         if (arr[j] < arr [j - 1]) {
          temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
       }
       }
    }
    for(int i =0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    for(int i=arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
    }
  }
}
