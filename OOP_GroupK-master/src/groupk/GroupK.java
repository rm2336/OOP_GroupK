/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupk;

import Alex.QuizGUI;
import Tiernan.Glossary;
import Roko.CalculatorEditor;
import Roko.CalculatorMenu;

/**
 *
 * @author rokom, tiernanm, alexm
 */
public class GroupK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // common menu
        MainMenu ourGUI = new MainMenu();
        ourGUI.setLocationRelativeTo(null);
        
        // Roko's menu initialisation statements
        CalculatorMenu rokosMenu = new CalculatorMenu();
        CalculatorEditor rokosEditor = new CalculatorEditor();
        ourGUI.setCalculatorMenu(rokosMenu);
        rokosMenu.setMainMenu(ourGUI);
        rokosMenu.setCalcEditorMenu(rokosEditor);
        rokosMenu.setLocationRelativeTo(null);
        rokosEditor.setCalculatorMenu(rokosMenu);
        rokosEditor.setLocationRelativeTo(null);
        
        // Alex's menu initialisation statements
        QuizGUI alexsMenu = new QuizGUI();
        alexsMenu.setMainMenu(ourGUI);
        alexsMenu.setLocationRelativeTo(null);
        ourGUI.setQuizMenu(alexsMenu);
        
        //Tiernan's menu initialisation statements
        Glossary tiernansMenu = new Glossary();
        tiernansMenu.setMainMenu(ourGUI);
        tiernansMenu.setLocationRelativeTo(null);
        ourGUI.setGlossaryMenu(tiernansMenu);
        // render the GUI
        ourGUI.setVisible(true);
    }
    
}
