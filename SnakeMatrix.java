import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int startEmptySpaces = n - 1, endEmptySpaces = 0, counter = 1, temp = n;
        while(n >=1){
            counter = printGivenLimitLineInMatrix(counter, startEmptySpaces, endEmptySpaces, temp);
            startEmptySpaces--;
            endEmptySpaces++;
            System.out.println();
            n--;
        }
    }

    private static int printGivenLimitLineInMatrix(int counter,int startEmptySpaces, int endEmptySpaces, int n){
        boolean isDecrement = counter % 2 == 0 ? true :false;
        int temp = isDecrement ? counter + n: counter;
        printGivenLimitEmptySpaces(startEmptySpaces);
        while(n >= 1){
            System.out.print(counter+" ");
            counter = isDecrement ? (--counter) : (++counter);
            n--;
        }
        printGivenLimitEmptySpaces(endEmptySpaces);
        return isDecrement ? temp : counter;
    }

    private static void printGivenLimitEmptySpaces(int n){
        while(n >= 1){
            System.out.print(" ");
            n--;
        }
    }
}
