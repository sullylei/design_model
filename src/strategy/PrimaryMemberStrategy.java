package strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("对于初级会员的没有折扣");
        return booksPrice;
	}

}
