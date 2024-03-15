import java.util.Scanner;

class  bodymi{

    public static void main(String[] args){
        Scanner bobj = new Scanner(System.in);
        System.out.println("enter weight and height: ");
        float weight = bobj.nextFloat();
        float height = bobj.nextFloat();
         float bmi = weight/(height*height);
        System.out.println(bmi);
         if(bmi<=18.5){
            System.out.println("under weight");
         }
         else if(bmi>18.5 && bmi<=24.9) {
            System.out.println("normal weight");
         }
         else{
            System.out.println("over weight");
         }
    }
}
