package builder;

public class ConcreteBuilder implements Builder {
	private Product product = new Product();
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		//������Ʒ�ĵ�һ�����
		product.setPart1("��ţ�9527");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("���ƣ�***");
	}
	/**
	 * ��Ʒ���ط���
	 */
	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
