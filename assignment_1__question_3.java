import java.util.Scanner;

class cal{

    public static void main(String[] args){
        Scanner cobj = new Scanner(System.in);
        System.out.println("enter two number");
        int num1 = cobj.nextInt();
        int num2 = cobj.nextInt();
        System.out.println("enter operator");
        char opt =cobj.next().charAt(0);

        switch(opt){
            default: System.out.println("enter an opt");break;
            case '+': System.out.println(num1+num2);break;
            case '/':System.out.println(num1/num2);break;
            case '*':System.out.println(num1*num2);break;
            case '-':System.out.println(num1-num2);break;
        }

    }
}
