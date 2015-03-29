/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.instruction;

import comparc.parse.*;

/**
 *
 * @author aids
 */
public class IInstruction extends Instruction{
    
    private int rs;
    private int rd;
    private String offset;
    
    
    public IInstruction(){
        
    }
    
    public IInstruction(String command, char type, int addr, int rs, int rd, String offset) {
        super(command, type, addr);
        parse = new ItypeParser();
        this.rs = rs;
        this.rd = rd;
        this.offset = offset;
    }

    /**
     * @return the rs
     */
    public int getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(int rs) {
        this.rs = rs;
    }

    /**
     * @return the rd
     */
    public int getRd() {
        return rd;
    }

    /**
     * @param rd the rd to set
     */
    public void setRd(int rd) {
        this.rd = rd;
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
        return parse.genInst(this.getCommand(), rs, rd, offset);
    }
    
}
