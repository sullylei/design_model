package state1;

/**
 * ���������Ϊ
 * @author lei.s
 *
 */
public abstract class State {
	//����һ��������ɫ���ṩ�������
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}
	//��Ϊ1
	public abstract void handle1();
	//��Ϊ2
	public abstract void handle2();
	
}
