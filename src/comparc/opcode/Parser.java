/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.opcode;

/**
 *
 * @author aids
 */
public abstract class Parser {
    
    private String genRInst(String command, String param1, String param2, String param3){
        String inst;
        
        inst = command+' '+param1+", "+param2+", "+param3;
        
        return inst;
    }
    
}
