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
public class ItypeParser extends Parser{
    
     /*
     * generate instruction string
     */
    
    @Override
    public String genInst(String command, int param1, int param2, String param3){
        
        
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

    @Override
    public String genOpcode(String command, int param1, int param2, int param3) {
    
        
        switch (command) {
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
        
        opcode = String.format("%6s", Integer.toBinaryString(fcode)).replace(' ', '0');
        rd = String.format("%5s", Integer.toBinaryString(param1)).replace(' ', '0');
        rs = String.format("%5s", Integer.toBinaryString(param2)).replace(' ', '0');
        
        switch(command){
            case "DADDIU":
            case "ANDI":
            case "LWU":
            case "LW":
            case "SW":
                offset = String.format("%16s", Integer.toBinaryString(param3)).replace(' ', '0');
                break;
            case "BNE":
            
                break;
        }
        
        bin = opcode+rs+rd+offset;
        inst = creatOpcode(bin);
        return inst;
    }
    
}
