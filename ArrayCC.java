import java.util.Scanner;

public class ArrayCC {

    //pass by reference

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+3;
        }
    }
    public static void main(String[] args) {
        // int marks[]=new int[12]; //static size means not changed

        // int numbers[]={1,2,3,4};
        // String fruits[]={"apple","mango","banana"};

        // int marks[]=new int[100];
        // Scanner sc=new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println(marks[0]);
        int marks[]={97,98,99};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        

    }
    
}
