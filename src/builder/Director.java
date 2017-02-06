package builder;

public class Director {
	/**
     * ���е�ǰ��Ҫʹ�õĽ���������
     */
    private Builder builder;
    /**
     * ���췽�������뽨��������
     * @param builder ����������
     */
    public Director(Builder builder){
        this.builder = builder;
    }
    /**
     * ��Ʒ���췽����������ø���������췽��
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
