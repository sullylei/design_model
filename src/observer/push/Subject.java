package observer.push;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	/**
	 * ��������ע��Ĺ۲��߶���
	 */
	private List<Observer> list = new ArrayList<Observer>();
	/**
	 * ע��۲��߶���
	 * @param observer
	 */
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("attach observer");
	}
	/**
	 * ɾ���۲��߶���
	 * @param observer
	 */
	public void detach(Observer observer){
		list.remove(observer);
		System.out.println("detach observer");
	}
	/**
	 * ����
	 * @param newState
	 */
	public void nodifyObservers(String newState){
		for(Observer observer:list){
			observer.update(newState);
		}
	}
	
}
