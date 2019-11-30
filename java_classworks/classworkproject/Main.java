import java.util.Scanner;
public class Main {

    public static void main( String[] args) {
        GetValues GV = new GetValues();
        System.out.println("Enter values for number of sentences - 9,words - s and symbols in words -w");
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        CheckValidation CV = new CheckValidation();
        // System.out.println("fixedd " + CV.checkFormat(input));
        int[] values = GV.getValues(CV.checkFormat(input));
        myObj.close();
	
	for(int i=0;i<values.length;i++){
	    System.out.println("values " + values[i]);
    }
    }
}
