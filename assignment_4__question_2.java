import java.util.Scanner;    
class Employee{
    String name;
    int id;
    double salary;
    String company;

    public void accept(String name, int id, double salary){
     this.name = name;
     this.id = id;
     this.salary = salary;
            
    }
    public void accept(int id, String name, int salary){
        this.name = name;
        this.id = id;
        this.salary= salary;
    }
    public void display(){
        System.out.println("\nname: "+this.name+"\nid: "+this.id+"\nsalary: "+this.salary);
    }
}

class Prog{
    public static void main(String [] args){
    
        Employee empref = new Employee();
        Employee empref1 = new Employee();
        empref.accept("ajinky",89,100000.45);
        empref1.accept(90, "aji", 110566 );
        empref.display();
        empref1.display();

}

}