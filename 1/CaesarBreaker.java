
/**
 * Write a description of CaesarBreaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
import edu.duke.*;


public class CaesarBreaker {
       
         public int maxIndex ( int[] values){
           //je prend un tableau et je cherche le plus grand nombre je renvoie son index    
         int max= 0;
         for(int k=0; k < values.length; k++){
          if (values[max]< values[k] ) {
                max = k ;
            
            }
         }
         return max;
        }
    
    
         
     public int[] countLetters( String message){
          //je prend un message je créé un tableau qui va me donné le nombre de chaque lettre         
         
         String alph="abcdefghijklmnopqrstuvwxyz";
         int[]counts= new int[26];
          
                  for(int k=0; k < message.length(); k++){
                      char ch=Character.toLowerCase(message.charAt(k));
                      int dex= alph.indexOf(ch);
                      if(dex!= -1){ counts[dex]+=1;
            
            }
                                  
         }
         return counts;
        }
        
        
        
        
       public String decrypt(String encrypted) {
         //decripter un chiffre en appelant cesarMod j'appelle les fonctions dans cette classe cc.  utilise la methode dans cesar
            CaesarMod cc = new CaesarMod();
         int[] freqs= countLetters(encrypted);
         int maxDex= maxIndex(freqs);
         int dkey = maxDex-4;
          if (maxDex<4){   
              dkey=26-(4-maxDex);
            }
          
            return cc.encrypt(encrypted, 26-dkey);                           
        }
    
    
         public String halfOfString(String message, int start) {
         //return a new String that is every other character with thestartcall halfOfString(“Qbkm Zgis”, 0) 
         System.out.println("okooooo3");
         StringBuilder cutmes = new StringBuilder("");
         for(int i = 0; i < message.length(); i++) {
                if (i%2==start){cutmes.append( message.charAt(i));
                
                }
                                   
                } 
          
            return cutmes.toString();                           
        }
        
        
        
        public int getKey  ( String s){
        //countLetters me donne tableau apparition lettre maxIndexto donne le grand qui est la clé position de e.
        
         int[]tabfre= countLetters(s);
          int max= maxIndex(tabfre) ;  
         // System.out.println("max is"+ max);
          int key = max-4;
        
          if (max < 4){   
              key=26-(4-max);  
              System.out.println("ok in if1");
            }
            
          if (4 < max){   
              key = max-4;  
              System.out.println("ok in if2");
            }
            return key;
        }
        
        
         public String decryptTwoKeys (String encrypted){
         //in the CaesarBreaker class that has one parameter
         
            CaesarMod cc = new CaesarMod();
        String firsPart= halfOfString(encrypted,0);
        String seconPart= halfOfString(encrypted,1);
       // System.out.println("firstpart "+firsPart);
        int key1= getKey(firsPart);
        int key2= getKey(seconPart);
         System.out.println("The key use are"+ key1 +"and"+ key2);
        
       return cc.encryptTwoKeys(encrypted, 26-key1,26-key2);
        }
        
        
        
        
             //je test decrypt et encrypt que j'ai appelé par des print 
        public void testDecrypt  () {
        CaesarMod cc = new CaesarMod();
        FileResource fr = new FileResource();
        String message = fr.asString();
        System.out.println(message);
        String encr=cc.encrypt(message, 12);
        System.out.println(encr);
        String decry = decrypt(encr);
        System.out.println( "The decrypted message is   "+ decry ) ;        
        
    }  
    
    
       //je test decryptTwoKeys et encrypt que j'ai appelé par des print 
        public void testdecryptTwoKeys () {
        CaesarMod cc = new CaesarMod();
        FileResource fr = new FileResource();
        String message = fr.asString();
        System.out.println("The message is   "+message);
        String encr0=halfOfString(message,0);
        String encr1=halfOfString(message,1);
        System.out.println("part1"+encr0);
        System.out.println("part2"+encr1);
        
        String decr2=decryptTwoKeys(message);
             
        System.out.println( "The decrypted message is   "+ decr2 ) ;        
        
    }  
    
    
    

}
