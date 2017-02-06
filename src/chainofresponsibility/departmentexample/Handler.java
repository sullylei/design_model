package chainofresponsibility.departmentexample;

public abstract class Handler {
	/**
     * 持有下一个处理请求的对象
     */
	protected Handler successor;
	
	protected void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	protected Handler getSuccessor(){
		return this.successor;
	}
	/**
	 * 处理聚餐费用的申请
	 * @param user
	 * @param fee
	 * @return
	 */
	public abstract String handleFeeRequest(String user,double fee);
}
