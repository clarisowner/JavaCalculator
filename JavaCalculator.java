import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("                   ***JavaCalculator***                   ");
        System.out.println("введите свое выражение, которое необходимо посчитать (например 1 + 2):");

        String inp = scn.nextLine();
        try {
            String res = calc(inp);
            System.out.println("ответ: " + res);
        } catch (Exception e) {
                System.out.println("ошибка: " + e.getMessage());
        }
    }
public static String calc(String inp) throws Exception {
    String[] s = inp.split(" ");
    if (s.length != 3) {
        throw new Exception("неверный формат. используйте два числа со знаком (например 7 - 5).");
    }
    int n1 = Integer.parseInt(s[0]);
    int n2 = Integer.parseInt(s[2]);
    if (n2 == 0) {
        throw new Exception("деление на ноль запрещено.");
    }
    if ((n1 < 1 || n1 > 10) || (n2 < 1 || n2 > 10))
        throw new Exception("числа должны быть в диапазоне от 1 до 10.");
    char o = s[1].charAt(0);

    int res = switch (o) {
        case '+' -> n1 + n2;
        case '-' -> n1 - n2;
        case '*' -> n1 * n2;
        case '/' -> n1 / n2;
        default -> throw new Exception("неподдерживаемый знак. используйте +, -, *, /.");
    };
    return String.valueOf(res);
    }
}
