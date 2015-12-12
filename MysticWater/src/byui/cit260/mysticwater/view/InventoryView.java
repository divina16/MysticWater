/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.GameControl;
import byui.cit260.mysticwater.control.InventoryControl;
import byui.cit260.mysticwater.model.InventoryItem;
import mysticwater.MysticWater;

/**
 *
 * @author Trent Buckner
 */
public class InventoryView extends View {
    static InventoryView inventory;
    
    public InventoryView() {
        super("");
        
        String menu;
        menu = "\n"
            + "\n============================================"
            + "\n                 Inventory                  "
            + "\n============================================";
        
        //Get inventory list in game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        //for every item in the inventory list
        int counter = 1;
        for (InventoryItem nextInventoryItem : inventory) {
            menu += "\n" + String.format("%-2d", counter++) + " " + String.format("%-20s", nextInventoryItem.getDescription()) + " | Quanity " + nextInventoryItem.getQuantity();   
        }
        menu += "\n--------"
              + "\nMoney = " + MysticWater.getCurrentGame().getPlayer().getMoney()
              + "\n--------"
                + "\nR - Print Inventory Report"
                + "\nE - Exit Inventory"
            + "\n============================================";
        
        this.setPromptMessage(menu);
    }

    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
         switch (selection) {
            case "15":
                this.useRope();
                break;
            case "9":
                this.useJetpack();
                break;
            case "1":
                this.useAxe();
                break;
            case "22":
                this.useUmbrella();
                break;
            case "11":
                this.usePixieDust();
                break;
            case "24":
                this.useWrench();
                break;
            case "5":
                this.useFlyingShoes();
                break;
            case "10":
                this.useLadder();
                break;
            case "12":
                this.usePole();
                break;
            case "21":
                this.useSword();
                break;
            case "3":
                this.useCandy();
                break;
            case "19":
                this.useSpork();
                break;
            case "17":
                this.useShovel();
                break;
            case "16":
                this.useRubberChicken();
                break;
            case "14":
                this.usePulley();
                break;
            case "18":
                this.useSkateboard();
                break;
            case "20":
                this.useSurfboard();
                break;
            case "23":
                this.useWaffles();
                break;
            case "2":
                this.useCalculator();
                break;
            case "6":
                this.useHolyGrail();
                break;
            case "8":
                this.useJackHammer();
                break;
            case "4":
                this.useCompass();
                break;
            case "13":
                this.usePot();
                break;
            case "7":
                this.useHunkOfMeat();
                break;
            case "R":
                this.inventoryReport();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;            
        }
        return false;
    }

    private void useRope() {    
        try{
                this.console.println("Rope was used.");
                InventoryControl.useItem(InventoryItem.Item.rope.ordinal());
        }
        catch (Exception ex){
            ErrorView.display("Inventory View", "\nYou must enter a valid menu option.");
        }
    }
        

    private void useUmbrella() {
        try{
                this.console.println("Umbrella was used.");
                InventoryControl.useItem(InventoryItem.Item.umbrella.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void usePixieDust() {
        try{
                this.console.println("Pixie Dust was used.");
                InventoryControl.useItem(InventoryItem.Item.pixieDust.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }
    
    private void useAxe() {
        try{
                this.console.println("Axe was used.");
                InventoryControl.useItem(InventoryItem.Item.axe.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useWrench() {
        try{
                this.console.println("Wrench was used.");
                InventoryControl.useItem(InventoryItem.Item.wrench.ordinal());
            }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useFlyingShoes() {
        try{
                this.console.println("FlyingShoes were used.");
                InventoryControl.useItem(InventoryItem.Item.flyingShoes.ordinal());    
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useLadder() {
        try{
                this.console.println("Ladder was used.");
                InventoryControl.useItem(InventoryItem.Item.ladder.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void usePole() {
        try{
                this.console.println("Pole was used.");
                InventoryControl.useItem(InventoryItem.Item.pole.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useSword() {
        try{
                this.console.println("Sword was used.");
                InventoryControl.useItem(InventoryItem.Item.sword.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useCandy() {
        try{
                this.console.println("Candy was used.");
                InventoryControl.useItem(InventoryItem.Item.candy.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useSpork() {
        try{
                this.console.println("Spork was used.");
                InventoryControl.useItem(InventoryItem.Item.spork.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useShovel() {
        try{
                this.console.println("Shovel was used.");
                InventoryControl.useItem(InventoryItem.Item.shovel.ordinal());   
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useRubberChicken() {
        try{
                this.console.println("Rubber Chicken was used.");
                InventoryControl.useItem(InventoryItem.Item.rubberChicken.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void usePulley() {
        try{
                this.console.println("Pulley was used.");
                InventoryControl.useItem(InventoryItem.Item.pulley.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useSkateboard() {
        try{
                this.console.println("Skateboard was used.");
                InventoryControl.useItem(InventoryItem.Item.skateboard.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useSurfboard() {
        try{
                this.console.println("Surfboard was used.");
                InventoryControl.useItem(InventoryItem.Item.surfboard.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useWaffles() {
        try{
                this.console.println("Waffles was used.");
                InventoryControl.useItem(InventoryItem.Item.waffles.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useCalculator() {
        try{
                this.console.println("Calculator was used.");
                InventoryControl.useItem(InventoryItem.Item.calculator.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useHolyGrail() {
        try{
                this.console.println("Holy Grail was used.");
                InventoryControl.useItem(InventoryItem.Item.holyGrail.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useJackHammer() {
        try{
                this.console.println("Jack Hammer was used.");
                InventoryControl.useItem(InventoryItem.Item.jackHammer.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useCompass() {
        try{
                this.console.println("Compass was used.");
                InventoryControl.useItem(InventoryItem.Item.compass.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void usePot() {
        try{
                this.console.println("Pot was used.");
                InventoryControl.useItem(InventoryItem.Item.pot.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void useHunkOfMeat() {
        try{
                this.console.println("Hunk of Meat was used.");
                InventoryControl.useItem(InventoryItem.Item.hunkOfMeat.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }
  
    private void useJetpack() {
        try{
                this.console.println("Jetpack was used.");
                InventoryControl.useItem(InventoryItem.Item.jetpack.ordinal());
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "\nYou must enter a valid menu option.");
        }
    }

    private void inventoryReport() {
        InventoryReportView inventoryReport = new InventoryReportView("");
        inventoryReport.displayView();
    }
    
//    public static InventoryView getInstance() {
//        
//        if (inventory == null) {
//            inventory = new InventoryView();
//        }
//        return inventory;
//    }
}
