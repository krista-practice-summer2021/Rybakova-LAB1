import java.util.Scanner;

public class cal {
    private String[] part;

    public static void main(String[] args) {

        cal myF = new cal();

        myF.consoleNameInput();
        myF.splitStr();
    }

    public void consoleNameInput (){
        Scanner math = new Scanner(System.in) ;
        System.out.println("Введите строку. Пример: 2 + 1");

        String calculation=math.nextLine();
        this.part = calculation.split(" ");
    }
    public void splitStr () {
        String [] parts = this.part;

        int part1 = Integer.parseInt(parts[0]);
        int part2 = Integer.parseInt(parts[2]);

        int decision = 0;
        String operation = parts[1];
        switch (operation) {
            case "+":
                decision = part1 + part2;
                break;
            case "-":
                decision = part1 - part2;
                break;
            case "*":
                decision = part1 * part2;
                break;
            case "/":
                try {
                    decision = part1 / part2;
                } catch (ArithmeticException e) {
                    System.out.println("----");
                }

                break;

            default:
                throw new IllegalStateException("Неожиданное значение: " + operation);
        }
        String ans = String.valueOf(decision);
        System.out.println(ans);

    }
}

