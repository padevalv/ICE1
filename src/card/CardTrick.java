/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 *  @modifier [Deval Patel] [Student no-991727932]
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random random = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);  // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        
          // Ask the user to pick a card value and suit
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a card value (1 to 13): ");
        int userValue = input.nextInt();
        System.out.println("Pick a suit (0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs): ");
        int userSuitIndex = input.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];
        
        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
          // Search for the user's card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
          // Report whether the card was found
        if (found) {
            System.out.println("Congratulations! Your card " + userCard + " is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card " + userCard + " is not in the magic hand.");
        }
        
         // Add one hard-coded lucky card: 2 of Clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Hard-coded lucky card: change from 2 of Clubs to 10 of Diamonds
       // Card luckyCard = new Card();
       //luckyCard.setValue(10);  // Change the value to 10
       //luckyCard.setSuit("Diamonds");  // Change the suit to Diamonds

        
        // Check if the lucky card is in the magic hand
        found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }
        
         // Report the result for the lucky card
        if (found) {
            System.out.println("The lucky card " + luckyCard + " is in the magic hand!");
        } else {
            System.out.println("The lucky card " + luckyCard + " is not in the magic hand.");
        }
    }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    

