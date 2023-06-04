class Student {
    int rollno;
    String name;
    void insertRecord(int r,String n){
        rollno=r;
        name=n;
    }
    void displayinformation(){System.out.print(rollno+""+name);}
}
class TestStudent4{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(111,"Karn");
        s2.insertRecord(222,"Aryan");
        System.out.println(s1.rollno+""+s1.name);
        System.out.println(s2.rollno+""+s2.name);
    }
}
