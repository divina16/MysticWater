/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mysticwater.view;

import byui.cit260.mysticwater.control.MapControl;
import byui.cit260.mysticwater.control.MoveCharacterControl;
import byui.cit260.mysticwater.model.Map;
import byui.cit260.mysticwater.model.Scene;
import static byui.cit260.mysticwater.view.MapView.map;
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
        this.console.println(Scene.SceneType.start);
    }

    private void f2() {
    }

    private void f3() {
    }

    private void f4() {
    }

    private void f5() {
    }

    private void c1() {
    }

    private void c2() {
    }

    private void c3() {
    }

    private void c4() {
    }

    private void c5() {
    }

    private void b1() {
    }

    private void b2() {
    }

    private void b3() {
    }

    private void b4() {
    }

    private void b5() {
    }

    private void d1() {
    }

    private void d2() {
    }

    private void d3() {
    }

    private void d4() {
    }

    private void d5() {
    }

    private void m1() {
    }

    private void m2() {
    }

    private void m3() {
    }

    private void m4() {
    }

    private void m5() {
    }
    
}
