package strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("对于高级会员的折扣为20%");
		return booksPrice * 0.8;
	}

}
