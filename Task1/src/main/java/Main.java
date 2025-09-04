import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        userInput();
    }

    public static int getYears(String degree) {
        int yearsToComplete = 0;

        switch(degree.trim().toLowerCase()) {
            case "bsc":
                yearsToComplete = 4;
                break;
            case "msc":
                yearsToComplete = 6;
                break;
            case "phd":
                yearsToComplete = 7;
                break;
        }
        return yearsToComplete;
    }

    public static void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a degree pls");
        String deg = input.nextLine().trim().toLowerCase();
        int yearstocomp = getYears(deg);

        if(yearstocomp == 0) {
            System.out.println("You entered an invalid degree..");
        } else {
            System.out.println("Amount of time to complete degree is: "+ yearstocomp);
        }
    }
}
