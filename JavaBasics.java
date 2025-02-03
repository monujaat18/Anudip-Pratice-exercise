import java.util.*;

public class JavaBasics {
 public static void evOdd(int number){
  if (number % 2 == 0) {
    System.out.println("Even");
  } else {
    System.out.println("Odd");
  }
 }
 public static void lorUper(char ch){
  if (ch >= 'a' && ch <= 'z') {
    System.out.println("Lowercase");
  } else {
    System.out.println("Uppercase");
  }
 }
 public static void idPas(int number , char ch){
  if (number == 1234 && ch == 'A') {
    System.out.println("Correct");
  } else {
    System.out.println("Incorrect");
  }
 }
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int number = scanner.nextInt();
  char ch = scanner.next().charAt(0);
  evOdd(number);
  lorUper(ch);
  idPas(number, ch);
  scanner.close();
  }
}