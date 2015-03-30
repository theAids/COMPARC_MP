/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.instruction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aids
 */
public abstract class InstructionList {
    
    private static HashMap codelist = new HashMap();
    
    public static void addEntry(int addr, Instruction inst){
        codelist.put(addr, inst);
    }
    
    public static void print(){
        Set set = codelist.entrySet();
        Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         Instruction inst = (Instruction) me.getValue();
         System.out.println(inst.getAddr());
      }    
    }
    
    public static Iterator getEntry(){
        Set set = codelist.entrySet();
        Iterator i = set.iterator();
        
        return i;
    }
    
    public static int getEntrySize(){
        return codelist.size();
    }
    
    
    
}
