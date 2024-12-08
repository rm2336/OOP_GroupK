/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiernan;

import java.util.ArrayList;

/**
 *
 * @author tiern
 */
public class GlossaryTerm {
    private String term;
    private String definition;
    private String category;
    private String example;
    private String relatedSDGTarget;
    
    public GlossaryTerm(String term, String definition, String category, String example, String relatedSDGTarget) {
        this.term = term;
        this.definition = definition;
        this.category = category;
        this.example = example;
        this.relatedSDGTarget = relatedSDGTarget;
    }
    
    // Getters
    public String getTerm() { return term; }
    public String getDefinition() { return definition; }
    public String getCategory() { return category; }
    public String getExample() { return example; }
    public String getRelatedSDGTarget() { return relatedSDGTarget; }
    
    @Override
    public String toString() {
        return term;
    }
}
