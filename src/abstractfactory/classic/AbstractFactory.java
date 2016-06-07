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
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public MainBoard createMainboard();
}
