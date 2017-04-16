import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringFilter stringFilter = new StringFilter();
        String inputString;
        boolean isArgumentIntroduceEnded;
        boolean isStringIntroduceEnded;

        do {
            System.out.print("Input searching string: ");
            inputString = in.nextLine();
            stringFilter.addArgument(inputString);
            isArgumentIntroduceEnded = isNextStringNeeded();
        }
        while (!isArgumentIntroduceEnded);

        do {
            System.out.print("Input analyzing string: ");
            inputString = in.nextLine();
            if (stringFilter.checkStringOnArguments(inputString)) {
                System.out.println("String contain argument");
            } else {
                System.out.println("String do not contain argument");
            }
            isStringIntroduceEnded = isNextStringNeeded();
        }
        while (!isStringIntroduceEnded);


    }

    private static boolean isNextStringNeeded() {
        Scanner in = new Scanner(System.in);
        String inputString;
        boolean isCommandAdopted;
        boolean isNextStringNeeded;
        do {
            System.out.print("Input more one string? (Y/N)");
            inputString = in.nextLine();
            if (inputString.toUpperCase().equals("Y")) {
                isNextStringNeeded = false;
                isCommandAdopted = true;
            } else {
                if (inputString.toUpperCase().equals("N")) {
                    isNextStringNeeded = true;
                    isCommandAdopted = true;
                } else {
                    System.out.println("Wrong command added.");
                    isNextStringNeeded = false;
                    isCommandAdopted = false;
                }
            }
        } while (!isCommandAdopted);
        return isNextStringNeeded;
    }
}
