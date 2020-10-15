/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.BufferedReader;

/**
 *
 * @author SAPPI_WorkBech
 */
public class numericCalculator {
// q - первая цифра, w- вторая цифра, b - знак 
    public void calculate(BufferedReader reader, int q, int w, String b) {
        if (b.equals("+")) {
            int d = q + w;
            System.out.println("цифровой формат = " + d);
        }
        if (b.equals("-")) {
            int d = q - w;
            System.out.println("цифровой формат = " + d);
        }
        if (b.equals("*")) {
            int d = q * w;
            System.out.println("цифровой формат = " + d);
        }
        if (b.equals("/")) {
            int d = q / w;
            System.out.println("цифровой формат = " + d);
        }
    }
}
