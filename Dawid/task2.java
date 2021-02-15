package com.qa.day4;

import java.util.Scanner;

public class task2 {
    
    public static void one() {
        Scanner input = new Scanner(System.in);
        int max = 100;
        int pos = 0;
        String suffix;
        
        
        System.out.println("What position did your dog get? ");
        pos = input.nextInt();
        
        for(int i = 1; i < max+1; i++){
            if(i == pos){
                //Don't print
            }else{
                if(i % 100 == 11 | i % 100 == 12|| i % 100 == 13){
                    suffix = "th";
                }
                else{
                    //Use the modulo operation to divide by 10 which will always get me the end number.
                    //Test it to see if it's either 1, 2 or 3. 
                    switch(i%10){
                        case 1:
                            suffix = "st";
                            break;
                        case 2:
                            suffix = "nd";
                            break;
                        case 3:
                            suffix = "rd";
                            break;
                        default:
                            suffix = "th";
                    }
                }
                //Print everything out and use a comma if its not at the end.
                System.out.print(i + suffix + ((i != max) ? "," : ""));
            }
        }
    }
}
