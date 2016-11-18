/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hapax.legomenon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ardol7945
 */
public class HapaxLegomenon {

    /**
     * @param args the command line arguments
     */
    int Hapax;
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList();
        Scanner input = new Scanner(System.in);
        int n;
        String word;
        System.out.println("How many words");
        n = input.nextInt();
        int Hapax = n;
        input.nextLine();
        //String wordss[][] = new String[16][n];
        for(int i = 0;i<n;i++){
           
            System.out.println("Enter a word ");
            word = input.nextLine();
            words.add(word);
          
         
          }
       
        }
        
        System.out.println("Number of words that occur once: " + Hapax);
        
      /*  for(int i = 0;i<words.size();i++ ){
            for(int p = 0; p<wordss.length; p++){
                for(int m = 0; m<wordss[p].length;m++){
                    
                    if((words.get(i)).length() == p){
                     wordss[p][m] = words.get(i);       
             }   
            }
           }
          
        }
        
        for(int i = 0;i<wordss.length;i++){
            for(int h = 0; h<wordss[i].length;h++){
                System.out.println(wordss[i][h]);
            }
    }
              */
        
       
        
        
        
        
// TODO code application logic here
    }
    
}
