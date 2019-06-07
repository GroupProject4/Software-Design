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
public class GroupOfUno {
     private int handSize=60;
    public UNO[] cards = new UNO[handSize];
    
    //generate hand of 60 cards
    public void generateHand()
    {
         int countCards=0;
           
        for(UNO.Color c: UNO.Color.values())
        {
               for(UNO.Rank r: UNO.Rank.values())
                {
                    cards[countCards]=(new UNO(c , r));
                    countCards++;
                }
        }
    
        }
    
}

    
    
