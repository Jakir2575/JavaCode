/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author DELL
 */
import java.util.*;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         HashSet<String> s1=new HashSet(); 
         Collections.synchronizedSet(s1);
         s1.add("Jakir");
         s1.add("one");
         s1.add("two");
         s1.add("three");
         s1.add("four");
         
         System.out.println(s1);
         
         Iterator it = s1.iterator();
         
         while (it.hasNext()) {
            System.out.println("for this i have used while " + it.next());
            
        }
         
         for (String x:s1){
             
             System.out.println(x);
         }
         
         
         
         HashSet<String> s2 = new HashSet();
         
         s2.add("hii");
         s2.add("hello"); 
         s2.add("hello");
         
         s1.addAll(s2);
         
         System.out.println(s1);
         System.out.println(s1.isEmpty());
         System.out.println(s1.size());
//         System.out.println(s1.clear());
         
         
    }
    
}