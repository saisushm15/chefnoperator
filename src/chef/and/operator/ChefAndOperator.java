/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chef.and.operator;
import java.util.Scanner;
/**
 *
 * @author konda babu
 */
public class ChefAndOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
           int A=input.nextInt();
        int B=input.nextInt();
       
        if(B>A)
            System.out.println("<");
        else if(B<A)
            System.out.println(">");                
        else
            System.out.println("=");                        
        }
        t--;       
    }
    
}
