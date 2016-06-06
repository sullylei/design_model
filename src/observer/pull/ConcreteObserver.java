package observer.pull;

public class ConcreteObserver implements Observer {
    //�۲��ߵ�״̬
    private String observerState;
    /**
     * ��ģ�����������֪���۲��߾�����Ҫʲô���ݣ�
     * û�а취������£��ɴ�������ݸ��۲��ߣ��ù۲����Լ�ȥ����Ҫȡֵ
     */
    @Override
    public void update(Subject subject) {
        /**
         * ���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("�۲���״̬Ϊ��"+observerState);
    }

}