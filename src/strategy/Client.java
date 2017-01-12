package strategy;

public class Client {

	public static void main(String[] args) {
		// 选择并创建需要使用的策略
		MemberStrategy strategy = new AdvancedMemberStrategy();
		//
		Price price = new Price(strategy);
		double quote = price.quote(300);
		System.out.println("图书的最终报价为"+quote);
	}

}
