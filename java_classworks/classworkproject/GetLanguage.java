public class GetLanguage{
    public String getLanguage(){
        System.out.println("Enter Language :");
        Scanner myObj = new Scanner(System.in);
        String language = myObj.nextLine();
        myObj.close();
        return language;
    }
}