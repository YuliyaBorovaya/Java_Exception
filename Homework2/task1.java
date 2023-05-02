import java.util.Scanner;

public class HomeWork2 {
    // task1
   
    public static float getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        while (!sc.hasNextFloat()) {
            System.out.print("Введенные данные не дробное число! Повторите ввод: ");
            sc.next();

        }
        float userNumber = sc.nextFloat();
        sc.close();
        System.out.print("Введенно дробное число: " + userNumber);
        return userNumber;
    }

    // task2 исправить если нужно
  
    public static void task2() {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    // task3
    
    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя");
            
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { 
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { 
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        task4();
    }

    
        public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String userMessage = sc.nextLine();
        sc.close();
        if (userMessage.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }        
    }
}

