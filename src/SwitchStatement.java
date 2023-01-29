public class SwitchStatement {

    public static void main(String[] args) {
        natoRef('E');
        DayOfWeek(0);
    }

    public static char natoRef ( char Char){
        switch (Char){
            case 'A' -> System.out.println("A is Able");
            case 'B' -> System.out.println("B is Baker");
            case 'C' -> System.out.println("C is Charlie");
            case 'D' -> System.out.println("D is Dog");
            case 'E' -> System.out.println("E is Easy");
            default -> System.out.println("Invalid character");
        }
        return 0;
    }

    public static void DayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 3 -> ("Wednesday");
            case 4 -> ("Thursday");
            case 5 -> ("Friday");
            case 6 -> ("Saturday");
            default -> ("Invalid input");
        };
        System.out.println(dayOfWeek);
    }
}
