import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {
        Scanner sentence = new Scanner(System.in);
        System.out.println("Input: ");
        String operation = sentence.nextLine();
        String[] work = operation.split(" ");
        RomanNums num = new RomanNums();
        int a = num.check(work[0]);
        int b = num.check(work[2]);
        String symbol = work[1];
        int result;
        switch (symbol) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default: throw new MyException("Ошибка! Калькулятор работает толко с операциями +, -, *, / !");
        }
        System.out.println("Result: ");
        System.out.println(num.checkResult(result));

    }
}
