/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author GroupProject4
 */
public class UnoPlayer {
      public static void main(String[] args) {
        GroupOfUno ch = new GroupOfUno();
        
        ch.generateHand();
        
        for(UNO c:ch.cards)
        {
            System.out.println(c.getRank() + " of " + c.getColor());
        }
    }
    
}
    

