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
    
    String inst;
    String rd;
    String rs;
    String rt;
    String offset;
    String func;
    String opcode;
    String extra;
    String bin;
    int fcode;

    public Parser(){
    
    }
    
    public String genInst(String command, int param1, int param2, int param3){
        return inst;
    }

    public String genInst(String command, int param1, int param2, String param3){
        return inst;
    }
    

    public String genInst(String command, String param1){
        
        inst = command+' '+param1;
        
        return inst;
    }
    
    /*
     * generate opcode R and I type
     */
    
    public abstract String genOpcode(String command, int param1, int param2, int param3);
    
    public String creatOpcode(String bin){
        int temp;
        
        temp = Integer.parseInt(bin, 2);
        
        return String.format("%8s",Integer.toHexString(temp).toUpperCase()).replace(' ', '0');
        
    }
    
    
}
