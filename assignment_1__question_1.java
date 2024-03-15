
import java.util.Scanner;
class Grade{

    public static void main(String [] args){

     Scanner Gobj = new Scanner(System.in);
     System.out.print("enter grade");
     int grade = Gobj.nextInt();

    if (grade >= 70){
        System.out.println("Destingtion");
    }
    else if ((grade <= 70) && (grade >= 55)){
        System.out.println("First class");
    }
    else if ((grade < 55) && (grade >=45)){
        System.out.println("pass");
    }
    else{
        System.out.println("fail");
    }
    

    }

}