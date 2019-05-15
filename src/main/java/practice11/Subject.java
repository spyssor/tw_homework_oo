package practice11;

import java.util.ArrayList;

//被观察者类
public class Subject {

    private boolean change = false;
    private ArrayList<Observer> obs;

    public Subject(){
        obs = new ArrayList<>();
    }

    public void setChange(){
        change = true;
    }

    public void clearChange(){
        change = false;
    }

    public void addObserver(Observer o){
        if (o == null){
            throw new IllegalArgumentException("parameter is null!");
        }
        obs.add(o);
    }

    public void notifyNewLeader2Observers(Object arg){
        for (Observer o : obs){
            o.updateLeader(this, arg);
        }
        clearChange();
    }

    public void notifyNewMember2Observers(Object arg){
        if (!change){
            return;
        }else{
            for (Observer o : obs){
                o.updateMember(this, arg);
            }
            clearChange();
        }
    }
}
