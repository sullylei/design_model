package strategy;

public class Client {

	public static void main(String[] args) {
		// ѡ�񲢴�����Ҫʹ�õĲ���
		MemberStrategy strategy = new AdvancedMemberStrategy();
		//
		Price price = new Price(strategy);
		double quote = price.quote(300);
		System.out.println("ͼ������ձ���Ϊ"+quote);
	}

}
