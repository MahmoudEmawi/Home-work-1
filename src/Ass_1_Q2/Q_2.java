/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass_1_Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mahmoud Emawi
 */
public class Q_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        long inputNumber;
        int buffer;
        int times = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number: ");
        inputNumber =  Long.parseLong(br.readLine());

        if(inputNumber > Integer.MAX_VALUE){
            times = (int)(inputNumber / Integer.MAX_VALUE*-1);
            buffer = (int)( inputNumber% Integer.MAX_VALUE) * 1;
        }else{
            buffer =  (int)(inputNumber);
        }
          System.out.print("The given input was: "+buffer);
    }
    
}
