import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String S = calc.getString();
        System.out.println(calc.Calculate(calc.stringParse(S)));
        Scanner MyObj = new Scanner(System.in);
        System.out.print("Enter planet name: ");
        String N = MyObj.nextLine();
        System.out.print("Enter star name: ");
        String SN = MyObj.nextLine();
        System.out.print("Enter distance from "+SN+": ");
        int d = MyObj.nextInt();
        System.out.print("Enter planet's speed: ");
        int St = MyObj.nextInt();
        MyObj.close();
        Planet MyPlanet = new Planet(N, SN, d, St);
        Task(MyPlanet);
        
    }
       
        public static void  Task(Planet MyPlanet){
            ArrayList<Star> star_array = new ArrayList<Star>();
            ArrayList<Planet> planet_array = new ArrayList<Planet>();
            Scanner input = new Scanner(System.in);
            while (true){
                System.out.print("Enter star/planet for create star/planet: ");
                String s = input.nextLine();
                if (s.equals("star")) {
                    Star star = new Star();
                    star.set_parameters();
                    star.write_in_file();
                    star_array.add(star);
                }else if (s.equals("planet")) {
                    MyPlanet.write_in_file();
                    planet_array.add(MyPlanet);
                    for(int i=0; i < star_array.size(); i++){
                        if(star_array.get(i).name.equals(MyPlanet.StarName)){
                            MyPlanet.Time = MyPlanet.get_time(star_array.get(i).diameter);
                            star_array.get(i).planet_list.add(MyPlanet);
                        }
                    }
                }else break;
            }
            while (true) {
                System.out.print("Enter planet name, full galaxy or exit: ");
                String planet_name = input.nextLine();
                if(planet_name.equals("exit")){
                    break;
                }
                if (planet_name.equals("full galaxy")){
                    for(int s=0; s<star_array.size(); s++){
                        star_array.get(s).get_info();
                    }
                    for(int p=0; p<planet_array.size();p++){
                        planet_array.get(p).get_info();
                    }
                    break;
                }
                for(int i=0; i < planet_array.size(); i++) {
                    if (planet_name.equals(planet_array.get(i).Name)) {
                        planet_array.get(i).get_info();
                    }
                }
            }
            input.close();
        }
    }
    

