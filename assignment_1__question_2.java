import java.util.Scanner;

class Leapyear{

    public static void main(String[] args){
        Scanner lobj = new Scanner(System.in);
        System.out.println("enter year: ");
        int year = lobj.nextInt();
        if (year%4==0){
            System.out.println("leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }
}