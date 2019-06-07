/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author Esraa Eissa
 */
public class UNO {

   public enum Color{RED , YELLOW , BLUE , GREEN };
    public enum Rank{ZERO ,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE , REVERSE , DROWTWO , DROWFOUR , WILDCARD };
    
    private final Color color;
    private final Rank rank;
    
    UNO(Color c,Rank r)
    {
        color = c;
        rank = r;
    }

    /**
     * @return the color type
     */
    public Color getColor() {
        return color;
    }

    /**
     * @return the rank 
     */
    public Rank getRank() {
        return rank;
    }
    



}

