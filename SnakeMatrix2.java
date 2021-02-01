import java.util.Scanner;

public class SnakeMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n, temp,counter = 0,decider = 1;
        temp = n = sc.nextInt();
        int firstEmptySpaces = n - 1, endEmptySpaces = 0;

        while(temp >=1){
            counter = printGivenSankeLine(counter, n, decider, firstEmptySpaces, endEmptySpaces);
            System.out.println();
            decider *= -1;
            firstEmptySpaces--;
            endEmptySpaces++;
            temp--;
        }
    }

    private static int printGivenSankeLine(int counter,int n, int decider,int firstEmptySpaces,int endEmptySpaces){
        int temp = n;
        String numberString = "";
        while(temp >= 1){
            counter += decider;
            numberString +=counter +" ";
            temp--;
        }
        System.out.print( 
            getGivenNumOfEmptySpaces(firstEmptySpaces) + 
            numberString.trim() + 
            getGivenNumOfEmptySpaces(endEmptySpaces)
        );
        return counter + n + decider;
    }

    private static String getGivenNumOfEmptySpaces(int limit){
        String emptySpaces = "";
        while(limit >= 1){
            emptySpaces +=" ";
            limit--;
        }
        return emptySpaces;
    }
}
