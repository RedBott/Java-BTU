package com.company;

public class CheckValidation {
    public static String checkFormat(String input){
        String[] valuesString = input.split("-",9);
        for(int i=1;i<9;i++){
            try{int x = Integer.valueOf(valuesString[i]);}
            catch (NumberFormatException e){
                valuesString[i] = "5";
            }
        }
        String fixedInput = "";
        for(int i=0;i<valuesString.length;i++){
            fixedInput+=valuesString[i]+"-";
        }
        return fixedInput;
    }
}
