import java.util.*;
class Main {
  public static void main(String[] args) {
    first();
    second();
  }
  public static void first(){
    List arrOne = new ArrayList();
    Random rand = new Random();
    for(int i=0;i<12;i++){
      arrOne.add(rand.nextInt(100));
    }
    Collections.sort(arrOne);
    List arrTwo = new ArrayList(arrOne);
    int i = 0;
    for(Iterator x = arrTwo.iterator(); x.hasNext(); ){
      x.next();
      if(i%2==0){
        x.remove();
      }
      i++;
    }
    System.out.println("First :" + arrOne);
    System.out.println("Second :" + arrTwo);
  }
  public static void second(){
    List arrOne = new ArrayList();
    Random rand = new Random();
    for(int i=0;i<12;i++){
      arr.add(rand.nextInt(6)+5);
    }
    List arrTwo = new ArrayList(arrOne);
    for(int x = 3;x<arrTwo.siz();x-=-4){
      arrTwo.add(x+1;rand.nextInt(6)+20);
    }
    System.out.println("First :" + arrOne);
    System.out.println("Second :" + arrTwo);
  }
}
