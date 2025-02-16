import java.util.*;

public class ArrayFucntion {

    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("0. Exist");
        System.out.println("1. Display the element of the array");
        System.out.println("2. Insert the element at the end of the array");
        System.out.println("3. Insert the element at the beginning of the array");
        System.out.println("4. Insert the element at the given position of the array");
        System.out.println("5. Insert new element by the value");
    }

    public static int[] inputArr(int[] arr) {
        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] addAtEnd(int[] arr) {
        System.out.println("Enter the value you want to add at end  : ");
        int element = scanner.nextInt();
        int[] newarr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[newarr.length - 1] = element;
        return newarr;
    }

    public static int[] addAtBegg(int[] arr) {
        System.out.println("Enter the value you want to add at start : ");
        int element = scanner.nextInt();
        int[] newarr = new int[arr.length + 1];
        newarr[0] = element;
        for (int i = 1; i < arr.length; i++) {
            newarr[i + 1] = arr[i];
        }
        return newarr;
    }

    public static int[] addAtPos(int[] arr) {
        System.out.println("Enter the position you want to add : ");
        int position = scanner.nextInt();
        System.out.println("Enter the value you want to add : ");
        int element = scanner.nextInt();
        int[] newarr = new int[arr.length + 1];

        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position. Please enter a position between 0 and " + arr.length);
            return arr;
        }

        for (int i = 0; i < position; i++) {
            newarr[i] = arr[i];
        }

        newarr[position] = element;

        for (int i = position + 1; i < newarr.length; i++) {
            newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public static int[] addByValue(int[] arr) {
        System.out.println("Enter the value where you want to change : ");
        int value = scanner.nextInt();
        System.out.println("Enter the value : ");
        int element = scanner.nextInt();
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
            if (newarr[i] == value) {
                newarr[i] = element;
            }
        }
        return newarr;
    }

    public static void function(int[] arr) {
        int input;
        do {
            System.out.println("Enter the input : ");
            input = scanner.nextInt();
            switch (input) {

                case (0):
                    System.out.println("Thanks for programming !!!");
                    break;

                case (1):
                    display(arr);
                    System.out.println();
                    break;

                case (2):
                    arr = addAtEnd(arr);
                    display(arr);
                    System.out.println();
                    break;

                case (3):
                    arr = addAtBegg(arr);
                    display(arr);
                    System.out.println();
                    break;

                case (4):
                    arr = addAtPos(arr);
                    display(arr);
                    System.out.println();
                    break;
                case (5):
                    arr = addByValue(arr);
                    display(arr);
                    System.out.println();
                    break;

            }
        } while (input != 0);
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array : ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        inputArr(arr);
        menu();
        function(arr);
    }
}
