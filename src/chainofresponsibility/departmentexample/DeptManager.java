package chainofresponsibility.departmentexample;

public class DeptManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String str = "";
		if (fee < 1000) {
			// Ϊ�˲��ԣ��򵥵㣬ֻͬ������������
			if ("����".equals(user)) {
				str = "�ɹ������ž���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
			} else {
				// ������һ�ɲ�ͬ��
				str = "ʧ�ܣ����ž���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";
			}
		} else {
			System.out.println("���󴫵�");
			return getSuccessor().handleFeeRequest(user, fee);
		}
		return str;
	}

}
