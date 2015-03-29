/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.extra;
import javax.swing.table.TableModel;
/**
 *
 * @author Tricia
 */
public class RegisterSwitches {
    
    public RegisterSwitches(){
        //String reg_status[] = new String[32];
    }
    
    public static int rowNum(String reg){
        int row = -1;
        switch(reg){
            case "R0":
                row = 0;
                break;
            case "R1":
                row = 1;
                break;
            case "R2":
                row = 2;
                break;
            case "R3":
                row = 3;
                break;
            case "R4":
                row = 4;
                break;
            case "R5":
                row = 5;
                break;
            case "R6":
                row = 6;
                break;
            case "R7":
                row = 7;
                break;
            case "R8":
                row = 8;
                break;
            case "R9":
                row = 9;
                break;
            case "R10":
                row = 10;
                break;
            case "R11":
                row = 11;
                break;
            case "R12":
                row = 12;
                break;
            case "R13":
                row = 13;
                break;
            case "R14":
                row = 14;
                break;
            case "R15":
                row = 15;
                break;
            case "R16":
                row = 16;
                break;
            case "R17":
                row = 17;
                break;
            case "R18":
                row = 18;
                break;
            case "R19":
                row = 19;
                break;
            case "R20":
                row = 20;
                break;
            case "R21":
                row = 21;
                break;
            case "R22":
                row = 22;
                break;
            case "R23":
                row = 23;
                break;
            case "R24":
                row = 24;
                break;
            case "R25":
                row = 25;
                break;
            case "R26":
                row = 26;
                break;
            case "R27":
                row = 27;
                break;
            case "R28":
                row = 28;
                break;
            case "R29":
                row = 29;
                break;
            case "R30":
                row = 30;
                break;
            case "R31":
                row = 31;
                break;
        }
        
        return row;
    }
    
    public static boolean checkIfHex(String hexstr){
        for ( int i = 1 ; i < hexstr.length() ; i++ )
            if ( Character.digit(hexstr.charAt(i), 16) == -1 )
                return false;
        return true;
    }
    
    public static String piplineStage(){
        String stage = "";
        return stage;
    }
    
    public static void registerStatus(String rs){
        
    }
}
