/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
          c.setValue((int)(Math.random()*13)+1);
          c.setSuits(c.SUIT[(int)(Math.random()*4)]);
           magicHand[i]=c;//saving object in array
         System.out.println(c.getSuits()+""+c.getValue());
        }
     int value;
     String suit;
     System.out.println("Please enter suit?");
     suit = input.nextLine();
     System.out.println("Please enter a value?");
     value = input.nextInt();
     boolean flag = flase;
     for(int i = 0; i< magicHand.length, i++){
      if(value==magicHand[i].getValue()&&suit.equals(magicHand[i].getSuits()){
       System.out.println("Your card is in the array");
       flag = true;
      }
         }
         if(flag ==flase)
         System.out.println("Sorry your card is not in the Array?");
    }
    
}
