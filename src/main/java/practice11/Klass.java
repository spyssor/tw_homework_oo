package practice11;

public class Klass extends Subject {

    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader(){
        return this.leader;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() == null || student.getKlass().number != this.number){
            System.out.print("It is not one of us.");
        }else{
            this.leader = student;
            setChange();
            notifyNewLeader2Observers(leader);
        }
    }

    public void appendMember(Student student) {
        student.getKlass().number = this.number;
        setChange();
        notifyNewMember2Observers(student);
    }

    public boolean isIn(Student student){
        return this.equals(student.getKlass());
    }
}
