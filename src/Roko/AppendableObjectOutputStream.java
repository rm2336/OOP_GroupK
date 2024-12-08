/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roko;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author rokom
 */
public class AppendableObjectOutputStream extends ObjectOutputStream {
     public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
    }
    
     @Override
     protected void writeStreamHeader() throws IOException {
     reset();
     }
     
     // code inspired by https://stackoverflow.com/questions/1194656/appending-to-an-objectoutputstream
}
