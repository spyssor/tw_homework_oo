package practice11;

//观察者实现该接口
public interface Observer {

    void updateLeader(Subject o, Object arg);
    void updateMember(Subject o, Object arg);
}
