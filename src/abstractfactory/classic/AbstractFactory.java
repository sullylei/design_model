package abstractfactory.classic;

import abstractfactory.Cpu;
import abstractfactory.MainBoard;
/**
 * 
 * @author lei.s
 *
 */
public interface AbstractFactory {
    /**
     * ����CPU����
     * @return CPU����
     */
    public Cpu createCpu();
    /**
     * �����������
     * @return �������
     */
    public MainBoard createMainboard();
}
