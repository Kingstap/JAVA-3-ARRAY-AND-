
/**
 * Write a description of commonMod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import edu.duke.*;
public class WordLengths {
    public String[] getCommon(){
        FileResource resource = new FileResource("data/common.txt");
        String[] common = new String[20];
        int index = 0;
        for(String s : resource.words()){
            common[index] = s;
            index += 1;
        }
        
        // cette partie permet de mettre tout les mots du fichier common dans un tableau et le tableau apres permet d'afficher
         /*for (int k=0; k <=20; k++) { System.out.println(k + "'s=\t" + common[k] );        }*/
        
        return common;
    }
    
    
    
    // il prend un tableau et une liste si le mot est à la position k du tableau il te renvoie k donne la position mot dans un tableau
    public int indexOf(String[] list, String word) {
        for (int k=0; k<list.length; k++) {
            if (list[k].equals(word)) {
                   return k;
               }
           }
        return -1;
    }
    
    
    //je créé un tableau ou lorque je vois un mot de mon texte je fais plus 1 je compte
    
    public void countWords(FileResource resource, String[] common, int[] counts){
        for(String word : resource.words()){
            word = word.toLowerCase();
            int index = indexOf(common,word);
            if (index != -1) {
                counts[index] += 1;
            }
        }
    }
    
    
    void countShakespeare(){
        //String[] plays = {"caesar.txt", "errors.txt", "hamlet.txt",
            //          "likeit.txt", "macbeth.txt", "romeo.txt"};
        String[] plays = {"small.txt"};
        String[] common = getCommon();
        int[] counts = new int[common.length];
        for(int k=0; k < plays.length; k++){
            FileResource resource = new FileResource("data/" + plays[k]);
            countWords(resource,common,counts);
            System.out.println("done with " + plays[k]);
        }
        
        for(int k=0; k < common.length; k++){
            System.out.println(common[k] + "\t" + counts[k]);
        }
    }
    
    
    
    //je compte la longueur des mots d'un fichier je créé un tableau pour classer si un mot à pour taille 3 j'incrémente à 3
    //je dois gérer le cas ou le premier et dernier caracter ne soit pas des lettre donc la fonction lengt est completer
     public void countWordLengths (FileResource resource, int[] counts){
     
         for(String word : resource.words()){
                 word = word.toLowerCase();
                int size = word.length();
        
            if (!Character.isLetter(word.charAt(0))){
            size = size -1;
                 }

           if (!Character.isLetter(word.charAt(size - 1))){
           size = size -1;}

              if (size != -1) {
                counts[size] += 1;
            } }
        }
                         
        
        //je prend un tableau et je cherche le plus grand nombre que je renvoie
     public int indexOfMax ( int[] values){
                
         int max = 0;
         for(int k=0; k < values.length; k++){
          if (values[max] < values[k] ) {
                max = k;
            
            }
         }
         return max;
        }
                    
          //cette fonction etait juste un test pour voir les constructeurs avec TCLIST pas d'impact
        public void main(){
            
            CaesarCipher cc = new CaesarCipher();
            cc.printName();
            System.out.println("We have printed the first name already \n");
            CaesarCipher ccWithNewName = new CaesarCipher("Tcheutchoua");
            ccWithNewName.printName();
        }
        
        
        
        
        
        public void testCountWordLengths () {
        
        FileResource fr = new FileResource();
        int[] countés = new int[31];
        countWordLengths (fr, countés);
        int MaxLen= indexOfMax(countés );
        String[] common = new String[20];
        
        System.out.println("done with " );
        System.out.println(  "the commonLengthIs"+ MaxLen );
        for (int k=0; k <=31; k++) { System.out.println(k + "TheNumbofwordofLength" + countés[k]);        }
        
    }                            
                   
}
    
           
    
    
    

