class Student{
   private String name;
    private int id;
    private int std;

    public void accept(String name, int id, int std){
        this.name = name;
        this.id = id;
        this.std=std;
    } 
    public void display(){
        System.out.println(this.name+" "+this.id+" "+this.std);
    }
}

class stud{
    public static void main(String [] args){
    Student stud = new Student();
    Student stud1 = new Student();
    stud.accept("ajinkya", 34, 5);
    stud1.accept("rohan", 45, 6);
    stud.display();

    stud1.display();

    }
    
}