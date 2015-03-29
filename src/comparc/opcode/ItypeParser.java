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
public class ItypeParser extends Parser{
    
     /*
     * generate instruction string
     */
    @Override
    public String genInst(String command, String param1, String param2, String param3){
        
        switch (command) {
            case "DADDIU":
            case "ANDI":
                inst = command+' '+param1+", "+param2+", "+param3;
                break;
            case "LWU":
            case "LW":
            case "SW":
                inst = command+' '+param1+", "+param3+"("+param2+")";
                break;
            case "BNE":
                inst = command+' '+param2+", "+param1+", "+param3;
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
        
        return inst;
    }
    
}
