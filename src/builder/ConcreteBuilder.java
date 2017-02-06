package builder;

public class ConcreteBuilder implements Builder {
	private Product product = new Product();
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		//构建产品的第一个零件
		product.setPart1("编号：9527");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("名称：***");
	}
	/**
	 * 产品返回方法
	 */
	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
