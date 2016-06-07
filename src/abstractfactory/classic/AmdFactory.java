package abstractfactory.classic;

import abstractfactory.Cpu;
import abstractfactory.IntelCpu;
import abstractfactory.IntelMainBoard;
import abstractfactory.MainBoard;

public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public MainBoard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainBoard(938);
    }

}