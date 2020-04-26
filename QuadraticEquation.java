/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of A : ");
        
        double a = scanner.nextDouble();
        System.out.print("Enter value of B : ");
        
        double b = scanner.nextDouble();
        System.out.print("Enter value of C : ");
        
        double c = scanner.nextDouble();
        
        double root1 = 0;
        double root2 = 0;
        
        double discriminant = b * b - 4 * a * c;
        
        if(discriminant < 0){
            System.out.println("Roots are imaginary...");
        }
         if(discriminant == 0){
            System.out.println("Roots are equal...");
            //root = -b / 2 * a;
            
            root1 = -b / (2 * a);
            root2 = -b / (2 * a);
        }
         if(discriminant > 0){
            System.out.println("Roots are unequal...");
         
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
         }
         System.out.println("Roots of the quaratic equation are : ");
         System.out.println("Root 1 : " + root1);
         System.out.println("Root 1 : " + root2);
    
    
       
    }
    
}
