package templatemethod.template;

public abstract class AbstractTemplate {
	/**
	 * 模板方法
	 */
	public void templateMethod(){
		
	}
	/**
	 *抽象方法 
	 */
	protected abstract void abstractMethod();
	
	/**
	 * 沟子方法
	 */
	protected void hookMethod(){
		
	}
	
	/**
     * 基本方法（已经实现）
     */
    private final void concreteMethod(){
        //业务相关的代码
    }

}
