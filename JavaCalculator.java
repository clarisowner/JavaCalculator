import java.util.Scanner; // все классы пакета util надо импортировать вручню, теперь можем получать данные на ввод
public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // инициализируем объект Scanner, который считывает данные из ввода в консоль
        System.out.println("                 ***JavaCalculator***                   ");
        System.out.println("введите свое выражение, которое надо посчитать (например 1+2):"); // по запуску программы отобразиться сперва этот текст
        String inp = scn.nextLine(); // метод считывает введеные данные в консоль

        try {
            String res = calc(inp);
            System.out.println("результат: " + res);
        }catch (Exepiton e) {
                System.out.println("ошибка: " + e.getMessage());
            }




        }



    }
}
