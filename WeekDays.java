import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int day= sc.nextInt();
        switch(day){
            case 1: System.out.println("sat");
            break;
            case 2:System.out.println("sun");
            break;
            case 3:System.out.println("mon");
            break;
            case 4:System.out.println("tues");
            break;
            case 5:System.out.println("wed");
            break;
            case 6: System.out.println("thurs");
            break;
            case 7:System.out.println("friday");
            break;
            default:System.out.println("invalid day");
        }
    }
}
