package strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ߼���Ա���ۿ�Ϊ20%");
		return booksPrice * 0.8;
	}

}
