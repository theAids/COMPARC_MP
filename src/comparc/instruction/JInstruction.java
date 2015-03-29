/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.instruction;

import comparc.parse.JtypeParser;

/**
 *
 * @author aids
 */
public class JInstruction extends Instruction{
    
    private String offset;
    
    public JInstruction(){
        
    }

    public JInstruction(String command, char type, int addr,String offset) {
        super(command, type, addr);
        parse = new JtypeParser();
        this.offset = offset;
    }

    /**
     * @return the offset
     */
    public String getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public String getInst() {
        return parse.genInst(this.getCommand(), offset);
    }
    
}
