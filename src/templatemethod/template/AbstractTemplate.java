package templatemethod.template;

public abstract class AbstractTemplate {
	/**
	 * ģ�巽��
	 */
	public void templateMethod(){
		
	}
	/**
	 *���󷽷� 
	 */
	protected abstract void abstractMethod();
	
	/**
	 * ���ӷ���
	 */
	protected void hookMethod(){
		
	}
	
	/**
     * �����������Ѿ�ʵ�֣�
     */
    private final void concreteMethod(){
        //ҵ����صĴ���
    }

}
