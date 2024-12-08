/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiernan;


import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author tiern
 */
public class GlossaryManager {
    private ArrayList<GlossaryTerm> terms;
    
    public GlossaryManager() {
        terms = new ArrayList<>();
    }
    
    // Add and Remove terms
    public void addTerm(GlossaryTerm term) {
        terms.add(term);
    }
    
    public void removeTerm(GlossaryTerm term) {
        terms.remove(term);
    }
    
    // Search methods
   public ArrayList<GlossaryTerm> searchByTerm(String searchTerm) {
    ArrayList<GlossaryTerm> results = new ArrayList<>();
    
    // If search term is empty, return empty results
    if (searchTerm == null || searchTerm.trim().isEmpty()) {
        return terms;  // Return all terms if no search
    }
    
    // Search for matching terms
    for (GlossaryTerm term : terms) {
        // Skip if term is null
        if (term == null || term.getTerm() == null) {
            continue;
        }
        
        
        String termText = term.getTerm().toLowerCase();
        String searchText = searchTerm.toLowerCase();
        
        
        if (termText.contains(searchText)) {
            results.add(term);
        }
    }
    
    return results;
   }
    
    public ArrayList<GlossaryTerm> searchByCategory(String category) {
        ArrayList<GlossaryTerm> results = new ArrayList<>();
        for (GlossaryTerm term : terms) {
            if (term.getCategory().equalsIgnoreCase(category)) {
                results.add(term);
            }
        }
        return results;
    }
    
    public ArrayList<GlossaryTerm> searchByTermAndCategory(String searchTerm, String category) {
        ArrayList<GlossaryTerm> results = new ArrayList<>();
        for (GlossaryTerm term : terms) {
            if (term.getTerm().toLowerCase().contains(searchTerm.toLowerCase()) &&
                term.getCategory().equalsIgnoreCase(category)) {
                results.add(term);
            }
        }
        return results;
    }
    
    public void printAllTerms() {
    System.out.println("\nAll terms in manager:");
    for (GlossaryTerm term : terms) {
        System.out.println("Term: '" + term.getTerm() + "'");
    }
}
    
    // File operations
   public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (GlossaryTerm term : terms) {
                writer.write(term.getTerm() + "|");
                writer.write(term.getDefinition() + "|");
                writer.write(term.getCategory() + "|");
                writer.write(term.getExample() + "|");
                writer.write(term.getRelatedSDGTarget());
                writer.newLine();
            }
        }
    }
    
    public void loadFromFile(String filename) throws IOException {
        terms.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 5) {
                    GlossaryTerm term = new GlossaryTerm(
                        parts[0], // term
                        parts[1], // definition
                        parts[2], // category
                        parts[3], // example
                        parts[4]  // related SDG target
                    );
                    terms.add(term);
                }
            }
        }
    }
    
    // Get all terms
    public ArrayList<GlossaryTerm> getAllTerms() {
        return new ArrayList<>(terms);
    }
    
    // Sorting methods
    public void sortByAlphabet() {
        Collections.sort(terms, (a, b) -> a.getTerm().compareToIgnoreCase(b.getTerm()));
    }
    
    public void sortByCategory() {
        Collections.sort(terms, (a, b) -> a.getCategory().compareToIgnoreCase(b.getCategory()));
    }
}

