/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;

/**
 *
 * @author SAPPI_WorkBech
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws FormatIsNotCorrect, IOException {
        Calculator c = new Calculator();
        c.generalCalgulate();
    }
    
}
