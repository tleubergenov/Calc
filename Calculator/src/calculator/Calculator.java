/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SAPPI_WorkBech
 */
public class Calculator {

    public void generalCalgulate() throws IOException, FormatIsNotCorrect {
        // ввод число или арабские цифры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// парсинг числа или арабской цифры
        //String //a, 
        // b; //c;
        //String[] data = reader.readLine().replaceAll("\\s+", "").split("");
        //a = data[0];
        // b = data[1];
        //c = data[2];
        String b = "";
        String line = "";
        String a = "";
        String c = "";
        if ((line = reader.readLine()) != null) {
            String token[] = line.split("[-+*/]");
            if (line.contains("+")) {
                b = "+";
            }
            if (line.contains("-")) {
                b = "-";
            }
            if (line.contains("/")) {
                b = "/";
            }
            if (line.contains("*")) {
                b = "*";
            }
            a = token[0];
            c = token[1];

        }

        boolean isNumeric1 = a.chars().allMatch(Character::isDigit);
        boolean isNumeric2 = c.chars().allMatch(Character::isDigit);
        //System.out.println(" isNumeric1 = " + isNumeric1 + "         isNumeric2 = " + isNumeric2);

        if (isNumeric1 == true & isNumeric2 == true) //проверка числового
        {
//запуск в случае если это число, не арабские цифры
            int q = Integer.parseInt(a);
            int w = Integer.parseInt(c);

            if (q > 10) {
                throw new FormatIsNotCorrect("цифра не должна превышать 10, калькулятор работает с цифрами от 1 до 10");
            }
            if (w > 10) {
                throw new FormatIsNotCorrect("цифра не должна превышать 10, калькулятор работает с цифрами от 1 до 10");
            }

            numericCalculator nc = new numericCalculator();
            nc.calculate(reader, q, w, b);
        } else if (isNumeric1 == false & isNumeric2 == false) { // проверка если не число , арабские цифры
            //System.out.println("a "+ a);
            //System.out.println("c "+ c);
            //System.out.println("b  "+ b);//znak

            RomanNumerals rn1 = new RomanNumerals(a);// first number
            RomanNumerals rn2 = new RomanNumerals(c);// second number
            int i = rn1.toInt();
            int j = rn2.toInt();
            int result = 0;
            if (b.contains("+")) {
                result = i + j;
            } else if (b.contains("-")) {
                result = i - j;
            } else if (b.contains("*")) {
                result = i * j;
            } else if (b.contains("/")) {
                result = i / j;
            }
            //System.out.println("результат арабского формата = " + result);
            RomanNumerals res_rom = new RomanNumerals(result);
            System.out.println(res_rom.toString());
            //String string = "004-034556";
            //String s = data.split("[-+*/]");
            //String[] parts = string.split("[-+*/]");
            //int i = Integer.parseInt(parts[0]);
            //System.out.println(parts[0]);
            //System.out.println(parts[1]);
            //if(string.contains("+")){
            //  int k = i+i;
            //System.out.println("k = " + k);
            //}
        } else {
            throw new FormatIsNotCorrect("Неправильно ввели формат. Фомарт должен быть полностью на арабском или в цифровом формате");
        };
    }
}
