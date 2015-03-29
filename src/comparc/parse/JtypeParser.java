/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.parse;

/**
 *
 * @author aids
 */
public abstract class JtypeParser extends Parser{
    
    public static String genInst(String command, String param1){    //generate instuction line for J type
        
        inst = command+' '+param1;
        
        return inst;
    }
   
}
