package Instructions;

import Units.Instruction;
import Units.*;



public class SUB extends Instruction implements Parse{

    public SUB() {
        super("SUB", 0, 15);
    }
    @Override
    public String SetDataPath(String[] s) {
        opcode = "000000";
        rs = Parse.BtoS(Parse.parseDtoB(findReg((s[2])),5));
        rt =  Parse.BtoS(Parse.parseDtoB(findReg(s[3]),5));
        rd =  Parse.BtoS(Parse.parseDtoB(findReg(s[1]),5));
        shamt = "00000";
        func = "100010";
        return opcode +rs+rt+rd+shamt+func;
    }
}
