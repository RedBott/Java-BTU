import java.util.Scanner;
public class Main {

    public static void main( String[] args) {
        GetValues GV = new GetValues();
        System.out.println("Enter values for number of sentences - 9,words - s and symbols in words -w");
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        System.out.println("Enter Language :");
        String language = myObj.nextLine();
        CheckValidation CV = new CheckValidation();
        // System.out.println("fixedd " + CV.checkFormat(input));
        int[] values = GV.getValues(CV.checkFormat(input));
        myObj.close();
        Generator G = new Generator(values[1],values[0],values[3],values[2],values[5],values[4],language);
        System.out.println(G.generatePharagraph());
    }
}
