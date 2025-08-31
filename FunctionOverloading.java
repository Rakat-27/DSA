public class FunctionOverloading {

    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }

    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    // this is a code of function overloading..here return type is not important.parameters is important..
    // if the function name is same but return type is different...the code will not execute..it will give error
    public static void main(String[] args) {
        // int result=sum(10,12,12);
    //     System.out.println(result);
    // 
        System.out.println(sum(.25f,1.75f ));
        System.out.println(sum(10,2));

    }
}
