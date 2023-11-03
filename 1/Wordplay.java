
/**
 * Write a description of Wordplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wordplay {

    public boolean isVowel(char ch) {
         
        String Bvowel = "AEIOU";
        String lvowel = "aeiou";
        
         for(int i = 0; i < Bvowel.length(); i++) {
             
             if (Bvowel.indexOf(ch)!=-1 || lvowel.indexOf(ch)!=-1 ){
                return true;}
                
             else{return false;}
 
            }  ;     
         return true;
                                     }
    
       public StringBuilder replaceVowels(String phrase, char ch) {
         //remplace une  dans une phr
        StringBuilder mnphrase  = new StringBuilder(phrase);
                  String lvowel = "";
        
         for(int i = 0; i < phrase.length(); i++) {
             if (isVowel(phrase.charAt(i))==true){
             mnphrase.setCharAt(i,ch);            }     
          
                                     } ;return mnphrase;
                                    }                            
                                     
                                     
         public StringBuilder emphasize(String phrase, char ch) {
         
        StringBuilder nphrase  = new StringBuilder(phrase);
        int     idx= phrase.indexOf(ch);
         for(int i = 0; i < phrase.length(); i++) {
             if (idx%2==0){nphrase.setCharAt(idx,'*');}
             if (idx%2==1){nphrase.setCharAt(idx,'+');}
              System.out.println("oo="+ idx);
    
             idx=  phrase.indexOf(ch,idx+1);  
               System.out.println("ooo="+ idx);
            }  ;     
         return nphrase;
                                     }                     
                                     
                                     
                                     
                                     
                                     
      public String replaceVowelss(String phrase, char ch) {
       //Make a StringBuilder with the received phrase
          StringBuilder rephrase = new StringBuilder(phrase);
        
        
        
    return phrase;
}




  public void testWordPlay() {
      String chi = "Hello World";
      
    String ch1="Mary Bella Abracadabra";

      System.out.println("ok");
        System.out.println("character="+ chi);
          boolean rep= isVowel('b');
           boolean rep2= isVowel('a');
           boolean rep3= isVowel('C');
           boolean rep4= isVowel('E');
   StringBuilder res= replaceVowels(chi, '*');
   StringBuilder res2= emphasize(ch1, 'a');
   System.out.println("rep="+ rep);
   System.out.println("rep2="+ rep2);
   System.out.println("rep="+ rep3);
   System.out.println("rep2="+ rep4);     
   
   
        System.out.println("rep="+ res);
   System.out.println("rep2="+ res2);
    }
}
