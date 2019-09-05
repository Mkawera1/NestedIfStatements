import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //give a number from 1-12
        //then ask for another number from 1-7
        //i want to change them to month amd day of the week

        int num1,num2;
        String month;
        String dayofWeek;
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter in a number from 1 to 12: ");
        num1 = key.nextInt();
        System.out.println("Please enter in a number from 1 to 7: ");
        num2 = key.nextInt();

        if(num1 == 1){
            month = "January";
            if(num2 == 1){
                dayofWeek = "Sunday";
            }
            else if(num2 == 2){
                dayofWeek = "Monday";
            }
            else if(num2 == 3){
                dayofWeek = "Tuesday";
            }
            else if(num2 == 4){
                dayofWeek = "Wednesday";
            }
            else if(num2 == 5){
                dayofWeek = "Thursday";
            }
            else if(num2 == 6) {
                dayofWeek = "Friday";
            }
            else if (num2 == 7){
                dayofWeek = "Saturday";
            } else {
                System.out.println(" Not a valid number");
            }
        }
        System.out.println("The month is" + month + ", The day of the week is " + dayofWeek);
        else if(num1 == 2){
            month = "February";
            if(num2 == 1){
                dayofWeek = "Sunday";
            }
            else if(num2 == 2){
                dayofWeek = "Monday";
            }
            else if(num2 == 3){
                dayofWeek = "Tuesday";
            }
            else if(num2 == 4){
                dayofWeek = "Wednesday";
            }
            else if(num2 == 5){
                dayofWeek = "Thursday";
            }
            else if(num2 == 6) {
                dayofWeek = "Friday";
            }
            else if (num2 == 7){
                dayofWeek = "Saturday";
            } else {
                System.out.println(" Not a valid number");
            }
        }
        else if(num1 == 3){
            month = "March";
            if(num2 == 1){
                dayofWeek = "Sunday";
            }
            else if(num2 == 2){
                dayofWeek = "Monday";
            }
            else if(num2 == 3){
                dayofWeek = "Tuesday";
            }
            else if(num2 == 4){
                dayofWeek = "Wednesday";
            }
            else if(num2 == 5){
                dayofWeek = "Thursday";
            }
            else if(num2 == 6) {
                dayofWeek = "Friday";
            }
            else if (num2 == 7){
                dayofWeek = "Saturday";
            } else {
                System.out.println(" Not a valid number");
            }
        }
    }

}
