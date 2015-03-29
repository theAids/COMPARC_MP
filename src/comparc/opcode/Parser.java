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
    
    String inst;
    String rd;
    String rs;
    String rt;
    String offset;
    String func;
    String opcode;
    String extra;
    int fcode;
    public Parser(){
    
    }
    
    /*
     * generate instruction string R and I type
     */
    public String genInst(String command, String param1, String param2, String param3){
        
        inst = command+' '+param1+", "+param2+", "+param3;
        
        return inst;
    }
    
    /*
     * generate instruction string J type
     */

    public String genInst(String command, String param1){
        
        inst = command+' '+param1;
        
        return inst;
    }
    
    /*
     * generate opcode R and I type
     */
    
    public abstract String genOpcode(String command, int param1, int param2, int param3);
    
    
}
