package strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		// TODO Auto-generated method stub
		System.out.println("�����м���Ա���ۿ�Ϊ10%");
        return booksPrice * 0.9;
	}

}
