/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5;

/**
 *
 * @author USER
 */
public class studentrecordexample {
    public static void main(String[] args) { 
 
 
 StudentRecord annaRecord = new StudentRecord(); 
 
 System.out.println(annaRecord.getName()); 
 
 StudentRecord anna2Record = new StudentRecord(); 
 
 anna2Record.setName("Anna"); 
 
 anna2Record.setAddress("Philipina"); 
 
 anna2Record.setAge(15); 
 
 anna2Record.print(anna2Record.getName()); 
 
}
}

