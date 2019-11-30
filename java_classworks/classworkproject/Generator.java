import java.util.*;
public class Generator {
   public int symbolMax,symbolMin,wordMax,wordMin,sentMax,sentMin;
   public Generator(int smx,int smn,int wmx,int wmn,int semx,int semn){
      this.symbolMax = smx;
      this.symbolMin = smn;
      this.wordMax = wmx;
      this.wordMin = wmn;
      this.sentMax = semx;
      this.sentMin = semn;
   }
   Hashtable<String,String> alphabet = new Hashtable<String, String>();
   alphabet.put("en","abcdefghijklmnopqrstuvwxyz");
   alphabet.put("ru","абвгдеёжзийклмнопрстуфхцчшщъыьэюя");
   alphabet.put("deu","abcdefghijklmnopqrstuvwxyz");
   GetLanguage GL = new getLanguage();
   String userAlphabet[] = alphabet.get(GL.GetLanguage()).split();
   Random rand  = new Random();
   public String generateWord(){
      int symbolCount = rand.nextInt((this.symbolMax-this.symbolMin)+1)+this.symbolMin;
      String generatedWord = "";
      for(int i=0;i<symbolCount;i++){
         String ch = userAlphabet[rand.nextInt(userAlphabet.length)+1];
         generatedWord += ch;
      }
      return generatedWord;
   }
   public String generateSentence(){
      int wordCount = rand.nextInt((this.wordMax-this.wordMin)+1)+this.wordMin;
      String generatedSentence = "";
      for(int i=0;i<wordCount;i++){
         String word = generateWord();
         generatedSentence+=generateWord()+" ";
      }
      return generatedSentence.trim();
   }
   public String generatePharagraph(){
      int sentenceCount = rand.nextInt((this.sentMax-this.sentMin)+1)+this.sentMin;
      String generatedPharagraph = "";
      for(int i=0;i<sentenceCount;i++){
         String sentence = generateSentence();
         generatedPharagraph+=sentence+"\n";
      }
      return generatedPharagraph;
   }
}
