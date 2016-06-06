package singleton;
/**
 * ����volatile�ؼ��ֿ��ܻ����ε��������һЩ��Ҫ�Ĵ����Ż�����������Ч�ʲ����Ǻܸߡ�
 * ���һ�㽨�飬û���ر����Ҫ����Ҫʹ�á�Ҳ����˵����Ȼ����ʹ�á�˫�ؼ�������������ʵ���̰߳�ȫ�ĵ�����
 * ����������������ã����Ը��������ѡ�á�
 * @author lei.s
 *
 */
public class Singleton {
    private volatile static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        //�ȼ��ʵ���Ƿ���ڣ���������ڲŽ��������ͬ����
        if(instance == null){
            //ͬ���飬�̰߳�ȫ�Ĵ���ʵ��
            synchronized (Singleton.class) {
                //�ٴμ��ʵ���Ƿ���ڣ���������ڲ������Ĵ���ʵ��
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}