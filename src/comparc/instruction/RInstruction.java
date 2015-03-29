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
public class RInstruction extends Instruction{
    
    private int rs;
    private int rd;
    private int rt;
    private int func;
    
    public RInstruction(){
        
    }
    
    public RInstruction(String command, char type, int addr, int rs, int rt, int rd) {
        super(command, type, addr);
    
        this.rs = rs;
        this.rd = rd;
        this.rt = rt;
        this.func = func;
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
     * @return the rt
     */
    public int getRt() {
        return rt;
    }

    /**
     * @param rt the rt to set
     */
    public void setRt(int rt) {
        this.rt = rt;
    }

    /**
     * @return the func
     */
    public int getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(int func) {
        this.func = func;
    }

    @Override
    public String getInst() {
        return RtypeParser.genInst(this.getCommand(), rs, rt, rd);
    }
    
    
    
    
}
