import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calculator {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    public  String getString(){
        Scanner MyObj = new Scanner(System.in);
        String UserString = MyObj.next();
        MyObj.close();
        return UserString;
    }
    public static boolean isNumber(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
    public  ArrayList<String> stringParse(String s){
        ArrayList<String>ParsedString = new ArrayList<String>();
        int k=0;
        for(int i=0;i<s.length();i=k){
            String ElementStr = "";
            String ElementOper = "";
            String ElementBrec = "";
            if(s.charAt(i)=='('){
                for(int j=i;i<s.length();j++){
                if(s.charAt(j+1)!=')'){
                    ElementBrec+=s.charAt(j+1);
                }
                else{
                    i=j+2;
                    break;
                }
            }
            }
            if(ElementBrec!=""){
                ArrayList<String>BR = new ArrayList<String>();
                for(int m=0;m<ElementBrec.length();m++){
                    BR.add(String.valueOf(ElementBrec.charAt(m)));
                }
                ParsedString.add(String.valueOf(this.Calculate(BR)));
            }
            //int k=i;
            for(k=i;k<s.length();k++){
                if(isNumber(String.valueOf(s.charAt(k)))){
                    ElementStr+= String.valueOf(s.charAt(k));
                }
                else{
                    ElementOper+=String.valueOf(s.charAt(k));
                    k++;
                    break;
                }
            }
            if(ElementStr!=""){
            ParsedString.add(ElementStr);
            }
            if(ElementOper!=""){
            ParsedString.add(ElementOper);
            }


        }
        return ParsedString;
    }
     ////   5 - 6 + 4
     ////   -1 + 4
    public double Calculate(ArrayList<String> AL){    
        while (AL.indexOf("^")!=-1){
                int i = AL.indexOf("^");
                double R = Math.pow(Double.parseDouble(AL.get(i-1)),Double.parseDouble(AL.get(i+1)));
                AL.remove(i+1);AL.remove(i);AL.remove(i-1);
                AL.add(i-1,String.valueOf(R));       
            }
        while(AL.indexOf("*")!=-1){
                int k = AL.indexOf("*");
                double R = Double.parseDouble(AL.get(k-1)) * Double.parseDouble(AL.get(k+1));
                AL.remove(k+1);AL.remove(k);AL.remove(k-1);
                AL.add(k-1,String.valueOf(R));
            }
        while(AL.indexOf("/")!=-1){
                int k = AL.indexOf("/");
                double R = Double.parseDouble(AL.get(k-1)) / Double.parseDouble(AL.get(k+1));
                AL.remove(k+1);AL.remove(k);AL.remove(k-1);
                AL.add(k-1,String.valueOf(R));
            }
        while(AL.indexOf("-")!=-1){
                int k = AL.indexOf("-");
                double R = Double.parseDouble(AL.get(k-1)) - Double.parseDouble(AL.get(k+1));
                AL.remove(k+1);AL.remove(k);AL.remove(k-1);
                AL.add(k-1,String.valueOf(R));
            }
        while(AL.indexOf("+")!=-1){
                int k = AL.indexOf("+");
                double R = Double.parseDouble(AL.get(k-1)) + Double.parseDouble(AL.get(k+1));
                AL.remove(k+1);AL.remove(k);AL.remove(k-1);
                AL.add(k-1,String.valueOf(R));
            }

        return Double.parseDouble(AL.get(0));
}
    public void writeToFile(double d){
        LocalDateTime now = LocalDateTime.now();
        try{
            FileWriter file = new FileWriter("file.txt",true);
            PrintWriter pw = new PrintWriter(file);
            pw.print(d+" ");
            pw.println(dtf.format(now));
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}