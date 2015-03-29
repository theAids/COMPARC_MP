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
public class JtypeParser extends Parser{
    
    public JtypeParser(){
        super();
    }
    
    //@Override
    public String genInst(String command, String param1, String param2, String param3){
        String inst;
        
        inst = command+' '+param1;
        
        return inst;
    }

    @Override
    public String genOpcode(String command, int param1, int param2, int param3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
