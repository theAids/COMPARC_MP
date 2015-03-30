/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.parse;

import comparc.instruction.Instruction;
import comparc.instruction.RInstruction;

/**
 *
 * @author aids
 */
public abstract class RtypeParser extends Parser{
    
    public static String genInst(String command, int param1, int param2, int param3){   //generate instruction line for R type
        
        inst = command+' '+'R'+param1+", "+'R'+param2+", "+'R'+param3;
        
        return inst;
    }
    
    public static String genOpcode(RInstruction inst) {
        /*
            Get function code from FunctionCode class
        */
        
        switch (inst.getCommand()) {
            case "DADDU":
                fcode = FunctionCode.DADDU;
                break;
            case "DMULT":
                fcode = FunctionCode.DMULT;
                break;
            case "OR":
                fcode = FunctionCode.OR;
                break;
            case "DSLLV":
                fcode = FunctionCode.DSSLV;
                break;
            case "SLT":
                fcode = FunctionCode.SLT;
                break;
        }
        /*
            convert everything to binary
        */
        extra = "00000";
        opcode = "000000";
        func = String.format("%6s", Integer.toBinaryString(fcode)).replace(' ', '0');
        rd = String.format("%5s", Integer.toBinaryString(inst.getRd())).replace(' ', '0');
        rs = String.format("%5s", Integer.toBinaryString(inst.getRs())).replace(' ', '0');
        rt = String.format("%5s", Integer.toBinaryString(inst.getRt())).replace(' ', '0');
        
        /*
            combine binary and generate opcode in hex
        */
        
        bin = opcode+rs+rt+rd+extra+func;
        opcode = creatOpcode(bin);
        
        inst.setFunc(fcode);  //set function code 
        inst.setOpcode(opcode);  //set opcode;
        
        return opcode;
    }
    
    
}
