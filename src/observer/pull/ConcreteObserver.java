package observer.pull;

public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;
    /**
     * 拉模型是主题对象不知道观察者具体需要什么数据，
     * 没有办法的情况下，干脆把自身传递给观察者，让观察者自己去按需要取值
     */
    @Override
    public void update(Subject subject) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("观察者状态为："+observerState);
    }

}