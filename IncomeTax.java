public class IncomeTax {
    public static void main(String[] args) {
        int income=5000;
        double tax;
        if(income<500000){
            tax=0;
        }
        else if(income>=500000 && income<1000000){
            tax=income*(.1);
        }
        else {
            tax=income*(.3);
        }
        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }
}
