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
public abstract class Parser {
    
    static String inst;
    static String rd;
    static String rs;
    static String rt;
    static String offset;
    static String func;
    static String opcode;
    static String extra;
    static String bin;
    static int fcode;

    public Parser(){
    
    }
    /**
     * generate opcode from binary
     */
    
    protected static String creatOpcode(String bin){
        int temp;
        
        temp = Integer.parseInt(bin, 2);
        
        return String.format("%8s",Integer.toHexString(temp).toUpperCase()).replace(' ', '0');
        
    }
    
    
}
