package singleton.staticinnerclass;

/**
 * Creator: lei.s
 * Create Date: 2017��12��21��-17:48
 *
 * @Description:��̬�ڲ���ʵ�ַ�ʽ--����ʵ�ַ�ʽ
 * ����һ��˽�е��ڲ��࣬�ڵ�һ�������Ƕ����ʱ���ᴴ��һ��ʵ����
 * ������ΪSingletonHolder���ֻ࣬����Singleton.getInstance()�е��ã�
 * ����˽�е����ԣ������޷�ʹ��SingleHolder��������Singleton.getInstance()�Ͳ��ᴴ��ʵ����
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
