package singleton.staticinnerclass;

/**
 * Creator: lei.s
 * Create Date: 2017年12月21日-17:48
 *
 * @Description:静态内部类实现方式--最优实现方式
 * 定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。
 * 而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，
 * 由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例。
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private final static Singleton SINGLETON = new Singleton();
    }
    public static Singleton getSingleton(){
        return SingletonHolder.SINGLETON;
    }
}
