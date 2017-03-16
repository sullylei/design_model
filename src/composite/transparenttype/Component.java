package composite.transparenttype;

import java.util.List;
/**
 * ͸��ʽ �ϳ�ģʽ
 * @author lei.s
 *
 */
public abstract class Component {
    /**
     * ����齨���������
     */
    public abstract void printStruct(String preStr);
    /**
     * �ۼ�������������һ���ӹ�������
     * @param child �ӹ�������
     */
    public void addChild(Component child){
        /**
         * ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û�д˹���
         * ���������û��ʵ���������
         */
        throw new UnsupportedOperationException("����֧�ִ˹���");
    }
    /**
     * �ۼ���������ɾ��һ���ӹ�������
     * @param index �ӹ���������±�
     */
    public void removeChild(int index){
        /**
         * ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û�д˹���
         * ���������û��ʵ���������
         */
        throw new UnsupportedOperationException("����֧�ִ˹���");
    }
    
    /**
     * �ۼ������������������ӹ�������
     */
    public List<Component> getChild(){
        /**
         * ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û�д˹���
         * ���������û��ʵ���������
         */
        throw new UnsupportedOperationException("����֧�ִ˹���");
    }
}