package strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("���ڳ�����Ա��û���ۿ�");
        return booksPrice;
	}

}
