package academy.learnprogramming;


import java.util.Scanner;

public class MinNumberChallenge {

    private static Scanner scanner = new Scanner(System.in);

   // static MinNumberChallenge minNumberChallenge = new MinNumberChallenge();

    public static void main(String[] args) {

        int size = getArraySize();

        int[] myArray = new int[size] ;
        myArray = initialiseArray(myArray);
        myArray = readIntegers(size);

        int myMinNumber = findMinimum(myArray);

        System.out.println("Minimum number in the array is : "+myMinNumber);

    }
    public static int getArraySize(){
        System.out.println("Enter the Size of Array : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    public static int[] initialiseArray(int[] myArray){
        for(int i=0;i<myArray.length;i++){
            myArray[i]=0;
        }
        return myArray;
    }

    public static int[] readIntegers(int count){
        int[] myIntArray = new int[count];
        System.out.println("Enter "+count+" integers");
        for(int i=0;i<count;i++){
            myIntArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myIntArray;
    }

    public static int findMinimum(int[] arrayFull){

        int minNumber = Integer.MAX_VALUE;

        for(int i=0;i<arrayFull.length;i++){
            if(arrayFull[i]<minNumber){
                minNumber=arrayFull[i];
            }
        }

        return minNumber;

    }

}
