package practice10;

public class Klass {

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
            System.out.println("It is not one of us.");
        }else{
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        student.getKlass().number = this.number;
    }

    public boolean isIn(Student student){
        return this.equals(student.getKlass());
    }
}
