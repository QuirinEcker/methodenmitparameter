import java.util.Scanner;

public class Ecker_MethodenMitParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fromPosition;
        int toPosition;
        int lines;

        System.out.println("Mit diesem Programm werden Sterne ausgegeben");
        System.out.println();
        System.out.println();

        System.out.print("Bitte die von-Position eingeben: ");
        fromPosition = scanner.nextInt();

        System.out.print("Bitte die bis-Position eingeben: ");
        toPosition = scanner.nextInt();

        System.out.print("Bitte die Zeilenanzahl eingeben: ");
        lines = scanner.nextInt();

        System.out.println();
        System.out.println("Methoden mit Parameterübergabe");
        System.out.println("******************************");
        System.out.println();

        writeStars(fromPosition, toPosition, lines);
    }

    static void writeStars(int from, int to, int line) {
        for (int y = 0; y < from; y++){
            System.out.print(" ");
        }
        System.out.println("Hallo");

        for (int x = 0; x < line; x++){
            for (int i = 0; i < from; i++) {
                System.out.print(" ");
            }
            for (int z = 0; z < (to - from); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
