/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.PageAttributes;
import java.sql.Array;
import java.util.*;

import java.util.Random;
/**
 *
 * @author subha
 */
public class Uniquetokengenerator {
    public static String tokengenerator(int len){
        Random rand = new Random();
//        int rand_int1 = 
//        int rand_int2 = ;
//        int rand_int3 = ;


        

        String[] capiletter = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] smallletter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] character = new String[]{"@", "#", "$", "%", "^", "&", "*", "(", ")", "¢", "£", "¥"};
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        String uniquetoken = "";
        String value = "";
        for(int i=0;i <= len-1; i++){
            value =  capiletter[rand.nextInt(25)]+smallletter[rand.nextInt(25)]+character[rand.nextInt(11)]+numbers[rand.nextInt(8)];
            uniquetoken += value;
            
        }
        return uniquetoken.toString();
    }
}
