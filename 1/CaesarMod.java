import edu.duke.*;

public class CaesarMod {
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetp = "abcdefghijklmnopqrstuvwxyz";
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+
        alphabet.substring(0,key);
        
        String shiftedAlphabetp = alphabetp.substring(key)+
        alphabetp.substring(0,key);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
             int idxp = alphabetp.indexOf(currChar);
            //If currChar is in the alphabet
            if(idx != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            else if(idxp != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabetp.charAt(idxp);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }
    
    
    public String encryptTwoKeys(String input, int key1,int key2) {
         //remplace une  dans une phr
        StringBuilder mnphrase  = new StringBuilder(input);
         
                  String lvowel = "";
        String encrypted1 = encrypt(input, key1);
        String encrypted2 = encrypt(input, key2);
        
        StringBuilder encrypt1  = new StringBuilder(encrypted1);
        StringBuilder encrypt2  = new StringBuilder(encrypted2);
         for(int i = 0; i < input.length(); i++) {
                if (i%2==0){mnphrase.setCharAt(i, encrypt1.charAt(i));}
                if (i%2==1){mnphrase.setCharAt(i, encrypt2.charAt(i));}
                    //if (i%2==0){encrypt(input.substring(i, i+1),key1);
                                    // System.out.println(encrypt(input.substring(i, i+1),key2));}
                }   
                                return mnphrase.toString();                           
                            }
                 
                                
                                
    public void testCaesarm() {
        int key = 17;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted, 26-key);
        System.out.println(decrypted);
    }                            
                                
                                
    
    
    public void testCaesar() {
        int key = 17;
        int key1 = 8;
        int key2 = 21;
        String ch="At";
         String ch1="At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
         String ch2="Top ncmy qkff vi vguv vbg ycpx";   
         
         
      System.out.println("ok");
        String dev1 = encrypt(ch1, 15);
   String dev = encryptTwoKeys(ch1, 8,21);
   String dev00 = encryptTwoKeys(ch2, 24,6);
   
  
   System.out.println("encryp1="+dev1);
   System.out.println("encrypt2="+ dev);
   System.out.println("encryptForWork="+ dev00);
   //System.out.println("rep="+ rep3);
   //System.out.println("rep2="+ rep4);     
   
   
    }
}
