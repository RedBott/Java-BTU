import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;
import java.lang.Math;
public class First{
    public static void main(String[] args) {
        for(int i = 100;i<201;i++){
            double ans = function(i/100.0);
            String result = String.format("%.2f", ans);
            System.out.println(result);
            writeToFile(result,false);
        }
    }
    public static double function(double x){
        return x*x + 2*x + 3;
    }
    public static void writeToFile(String s,boolean stop){
      try{
        FileWriter file = new FileWriter("function.txt",true);
        PrintWriter pw = new PrintWriter(file);
        pw.println(s);
        pw.close();
      }
      catch(IOException e){
        e.printStackTrace();
      }
    }
}