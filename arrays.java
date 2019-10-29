package examples;

public class arrays {


public static void main (String[] args) {
    
    
    int playerAtt[] = new int[10];
    
    playerAtt[0] = 70;
    playerAtt[1] = 78;
    playerAtt[2] = 86;
    playerAtt[3] = 91;
    playerAtt[4] = 83;
    playerAtt[5] = 99;
    playerAtt[6] = 96;
    playerAtt[7] = 93;
    playerAtt[8] = 66;
    playerAtt[9] = 53;
    
    
    for (int i = 0; i < playerAtt.length; i = i + 1) {
        
        System.out.println(" Attribute: " + i + " Number: " + playerAtt[i]);
        
    }
   
    
}

}