/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.model.Map;
import static byui.cit260.mysticwater.view.FinalPuzzleView.finalPuzzle;
import static byui.cit260.mysticwater.view.MapView.map;
import static byui.cit260.mysticwater.view.PuzzleView.nPuzzle;
import mysticwater.MysticWater;

/**
 *
 * @author Nina Sanchez
 */
public class MoveCharacterView extends View {
    
    static MoveCharacterView move;
    
     public MoveCharacterView() {
         super("");
         String menu;
         
       menu = "\n"
            + "\n------------------------------------"
            + "\n|Where would you like to travel to?|"
            + "\n------------------------------------";
         
         Map map = MysticWater.getCurrentGame().getMap();
            
            menu += "\n\n-----------Map Grid---------------"
                    + "\n\n --------------------------\n";
            for (int rows = 0; rows < map.getNoRows(); rows++) {
                for (int columns = 0; columns < map.getNoColumns(); columns++){
                    menu += " | " + map.getLocations()[rows][columns].getScene().getMapSymbol();
                }
                menu += " |\n --------------------------\n";
            }
                
            menu += "\n-----------------------------------"
                    + "\nM - View Map"
                    + "\nE - Exit"
                    + "\n-----------------------------------";
            
            this.setPromptMessage(menu);
    }
     
    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch (selection) {
            case "M":
                this.mapView();
                break;
            case "F1":
                this.f1();
                break;
            case "F2":
                this.f2();
                break;
            case "F3":
                this.f3();
                break;
            case "F4":
                this.f4();
                break;
            case "F5":
                this.f5();
                break;
            case "C1":
                this.c1();
                break;
            case "C2":
                this.c2();
                break;
            case "C3":
                this.c3();
                break;
            case "C4":
                this.c4();
                break;
            case "C5":
                this.c5();
                break;
            case "B1":
                this.b1();
                break;
            case "B2":
                this.b2();
                break;
            case "B3":
                this.b3();
                break;
            case "B4":
                this.b4();
                break;
            case "B5":
                this.b5();
                break;
            case "D1":
                this.d1();
                break;
            case "D2":
                this.d2();
                break;
            case "D3":
                this.d3();
                break;
            case "D4":
                this.d4();
                break;
            case "D5":
                this.d5();
                break;
            case "M1":
                this.m1();
                break;
            case "M2":
                this.m2();
                break;
            case "M3":
                this.m3();
                break;
            case "M4":
                this.m4();
                break;
            case "M5":
                this.m5();
                break;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;       
        }
        return false;
    }


    private void mapView() {
        MapView.map = new MapView();
        map.displayView();
    }

    private void f1() {
        this.console.println("               Forest A\n"
                + "----------------------------------------------"
                + "\nTinkerbell: Hello " + MysticWater.getCurrentGame().getName()
                + "! To move forward "
                + "\nin your joueney you must prove your knowledge. "
                + "\nAnswer this puzzle as many times as you like "
                + "\nand recieve a reward for a correct answer.\n\n");
        
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void f2() {
        this.console.println("Forest B\n"
                + "----------------------------------------------"
                + "\nNibs: " + MysticWater.getCurrentGame().getName() 
                + "! There is a fallen tree in your path. You need an "
                + "Item to chop the fallen tree. Go to the shop to "
                + "buy items.");
    }

    private void f3() {
        this.console.println("Forest C\n"
                + "\nSiren: " + MysticWater.getCurrentGame().getName() + "! UP HERE! HELP ME! "
                + "I am stuck in a tree! You need an item to help me "
                + "get down!");
    }

    private void f4() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void f5() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void c1() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void c2() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void c3() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void c4() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void c5() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void b1() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void b2() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void b3() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void b4() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void b5() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void d1() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void d2() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void d3() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void d4() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void d5() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void m1() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void m2() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void m3() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void m4() {
        PuzzleView.nPuzzle = new PuzzleView();
        nPuzzle.displayView();
    }

    private void m5() {
        FinalPuzzleView.finalPuzzle = new FinalPuzzleView();
        finalPuzzle.displayView();
    }
}
