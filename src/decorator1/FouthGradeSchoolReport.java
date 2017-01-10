package decorator1;

public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		// TODO Auto-generated method stub
		//成绩单的格式是这个样子的
		System.out.println("尊敬的***家长：");
		System.out.println("......");
		System.out.println(" 语文 62 数学65 体育 95  自然  63");
		System.out.println(" ......");
		System.out.println("家长签名:    ");
		
	}

	@Override
	public void sign() {
		// TODO Auto-generated method stub
		System.out.println("家长签名为:");
	}

}
