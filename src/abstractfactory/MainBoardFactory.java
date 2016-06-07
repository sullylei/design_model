package abstractfactory;

public class MainBoardFactory {
    public static MainBoard createMainboard(int type){
        MainBoard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainBoard(755);
        }else if(type == 2){
            mainboard = new AmdMainBoard(938);
        }
        return mainboard;
    }
}
