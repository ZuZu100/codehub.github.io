/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyproject;

import java.util.Scanner;

/**
 *
 * @author BRUCE
 */
public class NewClass {
    public static void main(String [] args){
    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter pcode");
    String request=sc.nextLine();
    System.out.println("select * from productrecords where pcode like '"+request+"%'");
    
    
    }
    
}
