import java.util.Scanner;

class Vowel{

    public static void main(String [] args){
        Scanner vobj = new Scanner(System.in);
        System.out.println("enter alphabets:");
        char word  = vobj.next().charAt(0);
        if((word=='a')||(word=='A')||(word=='e')||(word=='E')||(word=='i')||(word=='I')||(word=='o')||(word=='O')||(word=='u')||(word=='U')){
        
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}