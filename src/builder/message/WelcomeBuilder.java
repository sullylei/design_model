package builder.message;

public class WelcomeBuilder extends Builder {
	
    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }
    
    @Override
    public void buildBody() {
        // TODO Auto-generated method stub
    	msg.setBody("��ӭ����");
    }

    @Override
    public void buildSubject() {
        // TODO Auto-generated method stub
    	msg.setSubject("��ӭ����");
    }
}