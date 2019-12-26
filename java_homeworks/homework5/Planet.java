import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Planet{
    String Name;
    String StarName;
    int Distance;
    int Speed;
    double Time;
    public Planet(String Name,String StarName,int Distance,int Speed){
        this.Name = Name;
        this.StarName = StarName;
        this.Distance = Distance;
        this.Speed = Speed;
    }
    public void get_info() {
        System.out.println("planet's name is - "+this.Name);
        System.out.println("star's name is - "+this.StarName);
        System.out.println("distance from star is - "+this.Distance);
        System.out.println("speed is - "+this.Speed);
        System.out.println("time for one cycle around the star - "+this.Time);
    }
    public double get_time(double star_diameter){
        return (star_diameter/2+this.Distance)*Math.PI/this.Speed;
    }


    public void write_in_file(){
        try{
            FileWriter file = new FileWriter("galaxy.txt",true);
            PrintWriter pw = new PrintWriter(file);
            pw.println("planet's name is - "+this.Name);
            pw.println("star's name is - "+this.StarName);
            pw.println("distance from star is - "+this.Distance);
            pw.println("speed is - "+this.Speed);
            pw.println("time for one cycle around the star - "+this.Time);
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}