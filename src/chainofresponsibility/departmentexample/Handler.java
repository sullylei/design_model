package chainofresponsibility.departmentexample;

public abstract class Handler {
	/**
     * ������һ����������Ķ���
     */
	protected Handler successor;
	
	protected void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	protected Handler getSuccessor(){
		return this.successor;
	}
	/**
	 * ����۲ͷ��õ�����
	 * @param user
	 * @param fee
	 * @return
	 */
	public abstract String handleFeeRequest(String user,double fee);
}
