/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupk_final;

import Roko.CalculatorEditor;
import Roko.CalculatorMenu;
import Alex.QuizGUI;
import Tiernan.MainGlossaryForm;

/**
 *
 * @author rokom
 */
public class GroupK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // main menu initialisation
        MainMenu ourMenu = new MainMenu();
        
        // Roko's menu initialisation statements
        CalculatorMenu rokosMenu = new CalculatorMenu();
        CalculatorEditor rokosEditor = new CalculatorEditor();
        rokosMenu.setCalcEditorMenu(rokosEditor);
        rokosMenu.setMainMenu(ourMenu);
        rokosMenu.setLocationRelativeTo(null);
        rokosEditor.setCalculatorMenu(rokosMenu);
        rokosEditor.setLocationRelativeTo(null);
        
        // Alex's menu initialisation statements
        QuizGUI alexsMenu = new QuizGUI();
        alexsMenu.setMainMenu(ourMenu);
        alexsMenu.setLocationRelativeTo(null);
        
        // Tiernan's menu initialisation statements
        MainGlossaryForm tiernansMenu = new MainGlossaryForm();
        tiernansMenu.setMainMenu(ourMenu);
        tiernansMenu.setLocationRelativeTo(null);
        
        // render the GUI
        //rokosMenu.setVisible(true);
        ourMenu.setCalculatorMenu(rokosMenu);
        ourMenu.setQuizMenu(alexsMenu);
        ourMenu.setGlossaryMenu(tiernansMenu);
        ourMenu.setLocationRelativeTo(null);
        ourMenu.setVisible(true);
    }
    
}

