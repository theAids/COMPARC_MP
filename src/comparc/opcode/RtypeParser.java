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
public class RtypeParser extends Parser{
    int temp;
    @Override
    public String genOpcode(String command, int param1, int param2, int param3) {
        /*
            Get function code from FunctionCode class
        */
        
        switch (command) {
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
        rd = String.format("%6s", Integer.toBinaryString(param1)).replace(' ', '0');
        rs = String.format("%6s", Integer.toBinaryString(param2)).replace(' ', '0');
        rt = String.format("%6s", Integer.toBinaryString(param3)).replace(' ', '0');
        
        /*
            combine binary and generate opcode in hex
        */
        inst = opcode+rs+rt+rd+extra+func;
        temp = Integer.parseInt(inst, 2);
        inst = String.format("%8s",Integer.toHexString(temp).toUpperCase()).replace(' ', '0');
            
        return inst;
    }
    
    
}
