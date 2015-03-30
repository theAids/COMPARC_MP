/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.compile;

import comparc.instruction.IInstruction;
import comparc.instruction.Instruction;
import comparc.instruction.InstructionList;
import comparc.instruction.RInstruction;
import comparc.parse.ItypeParser;
import comparc.parse.RtypeParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.table.TableModel;

/**
 *
 * @author aids
 */
public abstract class OpcodeCompiler {
    
    public static ArrayList<String> getOpcodes(TableModel model){
        
        ArrayList<String> opcodelist = new ArrayList<>();
        Instruction inst;
        String opstring = "hello";
        
        Iterator i = InstructionList.getEntry(); //get code list entries
        
        while(i.hasNext()){
            Map.Entry e = (Map.Entry)i.next();
            inst = (Instruction)e.getValue();
            
            //generate opcode
            switch(inst.getType()){
                case 'R':
                    opstring = RtypeParser.genOpcode((RInstruction) inst);
                    break;
                case 'I':
                    opstring = ItypeParser.genOpcode((IInstruction) inst);
                    break;
                case 'J':
                    break;
                default:
                    break;
            }
            
            opcodelist.add(opstring);
            
        }
             
        return opcodelist;
    }
    
}
