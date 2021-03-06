/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.parse;

import comparc.instruction.IInstruction;

/**
 *
 * @author aids
 */
public abstract class ItypeParser extends Parser{
    
    public static String genInst(String command, int param1, int param2, String param3){    //generate instruction line for I type
        
        
        switch (command) {
            case "DADDIU":
            case "ANDI":
                inst = command+' '+'R'+param2+", "+'R'+param1+", "+param3;
                break;
            case "LWU":
            case "LW":
            case "SW":
                inst = command+' '+'R'+param2+", "+param3+"("+'R'+param1+")";
                break;
            case "BNE":
                inst = command+' '+'R'+param1+", "+'R'+param2+", "+param3;
                break;
            default:
                break;
        }
        
        return inst;
    }

    public static String genOpcode(IInstruction inst) {
    
        
        switch (inst.getCommand()) {
            case "DADDIU":
                fcode = FunctionCode.DADDIU;
                break;
            case "ANDI":
                fcode = FunctionCode.ANDI;
                break;
            case "LWU":
                fcode = FunctionCode.LWU;
                break;
            case "LW":
                fcode = FunctionCode.LW;
                break;
            case "SW":
                fcode = FunctionCode.SW;
                break;
            case "BNE":
                fcode = FunctionCode.BNE;
                break;
            default:
                break;
        }
        
        func = String.format("%6s", Integer.toBinaryString(fcode)).replace(' ', '0');
        rd = String.format("%5s", Integer.toBinaryString(inst.getRd())).replace(' ', '0');
        rs = String.format("%5s", Integer.toBinaryString(inst.getRs())).replace(' ', '0');
        
        switch(inst.getCommand()){
            case "DADDIU":
            case "ANDI":
            case "LWU":
            case "LW":
            case "SW":
                offset = String.format("%16s", Integer.toBinaryString(Integer.parseInt(inst.getOffset()))).replace(' ', '0');
                break;
            case "BNE":
            
                break;
        }
        
        bin = func+rs+rd+offset;
        opcode = creatOpcode(bin);
        
        inst.setFunc(fcode);
        inst.setOpcode(opcode);
        
        return opcode;
    }
   
}
