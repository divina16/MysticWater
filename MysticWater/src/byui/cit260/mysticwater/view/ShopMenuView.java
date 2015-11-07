/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.ShopControl;
import java.util.Scanner;
import mysticwater.MysticWater;

/**
 *
 * @author Braden
 */
public class ShopMenuView {
    static ShopMenuView shopMenu;
    static ShopMenuView shop;
    
    private final String SHOP = "\n"
            + "\n============================================"
            + "\n                 Shop Menu                  "
            + "\n============================================"
            + "\n1 - 100 coins - Rope"
            + "\n2 - 50 coins - Umbrella"
            + "\n3 - 500 coins - Pixie Dust"
            + "\n4 - 250 coins - Axe"
            + "\n5 - 120 coins - wrench"
            + "\nB - Back to Game Menu"
            + "\n============================================";

    void displayShop() {
        char selection = ' ';
        do {
            System.out.println(SHOP);
            
            String input = this.shopMenuViewRequest();
            selection = input.charAt(0);
            
            this.doShopSelection(selection);
            
        } while (selection != 'B');
    }
    private String shopMenuViewRequest() {
    boolean valid = false;
       String shopMenuViewRequest = null;
       Scanner keyboard = new Scanner(System.in);
       
       while (!valid) {
          
           System.out.println("Select an option by entering the corresponding letter:");
           
           shopMenuViewRequest = keyboard.nextLine();
           shopMenuViewRequest = shopMenuViewRequest.trim();
           
           if (shopMenuViewRequest.length() == 0) {
               System.out.println("Invalid input - the value must not be blank");
               continue;
           }
           break;
       }
       return shopMenuViewRequest;
    }

    private void doShopSelection(char selection) {
        
        switch (selection) {
            case '1':
                this.buyRope();
                break;
            case '2':
                this.buyUmbrella();
                break;
            case '3':
                this.buyPixieDust();
                break;
            case '4':
                this.buyAxe();
                break;
            case '5':
                this.buyWrench();
                break;
            case 'B':
                this.backToGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                       
        }
    }

    private void buyRope() {
        ShopControl.createShop(MysticWater.getPlayer());    
                System.out.println("Rope was purchased.");

    }

    private void buyUmbrella() {
                System.out.println("Umbrella was purchased.");
    }

    private void buyPixieDust() {
                System.out.println("Pixie Dust was purchased.");
    }

    private void buyAxe() {
                System.out.println("Axe was purchased.");
    }

    private void buyWrench() {
                System.out.println("Wrench was purchased.");
    }

    private void backToGame() {
                System.out.println("backToGame was called");

    }

}
