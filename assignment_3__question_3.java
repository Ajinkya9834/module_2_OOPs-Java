//arithmetic operation of different data type
class arith{
    public static void main(String [] args){
        int n1 = 10;
        double n2 = 12.5;
        float n3 = 15.33f;

        int result_int = n1+(int)n2;
        double result_double = n1+n2;
        float result_float= (float)n2+n3;
        float result_float2 = n1+n3;
        int result_int2  = n1+(int)n3;
         double result_double2 = n1+n3;
         System.out.println("result_int:  "+result_int);
         System.out.println("result_double:  "+result_double);
         System.out.println("result_float:  "+result_float);
        System.out.println("result_float2:  "+result_float2);
        System.out.println("result_int2: "+result_int2);
        System.out.println("result_double2: "+result_double2);
    }
}