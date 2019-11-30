import java.util.*;
public class Generator {
   public int symbolMax,symbolMin,wordMax,wordMin,sentMax,sentMin;
   public String language;
   String userAlphabet[];
   public Generator(int smx,int smn,int wmx,int wmn,int semx,int semn,String lang){
      this.symbolMax = smx;
      this.symbolMin = smn;
      this.wordMax = wmx;
      this.wordMin = wmn;
      this.sentMax = semx;
      this.sentMin = semn;
      this.language = lang;
      switch(language){
         case "en":
            this.userAlphabet = "abcdefghijklmnopqrstuvwxyz".split("");
            break;
         case "ru":
            this.userAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".split("");
            break;
         case "deu":
            this.userAlphabet = "abcdefghijklmnopqrstuvwxyz".split("");
            break;
         default:
            this.userAlphabet = "abcdefghijklmnopqrstuvwxyz".split("");
      }}
   Random rand  = new Random();
   public String generateWord(){
      int symbolCount = rand.nextInt((this.symbolMax-this.symbolMin)+1)+this.symbolMin;
      String generatedWord = "";
      System.out.println("alphabet length" + userAlphabet.length);
      for(int i=0;i<symbolCount;i++){
         String ch = userAlphabet[rand.nextInt(userAlphabet.length)];
         generatedWord += ch;
      }
      return generatedWord;
   }
   public String generateSentence(){
      int wordCount = rand.nextInt((this.wordMax-this.wordMin)+1)+this.wordMin;
      String generatedSentence = "";
      for(int i=0;i<wordCount;i++){
         generatedSentence+=generateWord()+" ";
      }
      return generatedSentence.trim();
   }
   public String generatePharagraph(){
      int sentenceCount = rand.nextInt((this.sentMax-this.sentMin)+1)+this.sentMin;
      String generatedPharagraph = "";
      for(int i=0;i<sentenceCount;i++){
         generatedPharagraph+=generateSentence()+"\n";
      }
      return generatedPharagraph;
   }
}
