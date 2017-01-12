package strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
	}

}
