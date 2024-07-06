package cloud.englert.patterns.behaviour.nullobject;

public class Main {
    public static void main(String[] args) {
        Schachfigur[][] schachfiguren = new Schachfigur[8][8];
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                schachfiguren[row][column] = new NullObject();
            }
        }

        schachfiguren[2][5] = new Turm();
        schachfiguren[4][2] = new Turm();
        schachfiguren[6][1] = new Springer();
        schachfiguren[5][6] = new Springer();

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                System.out.print(schachfiguren[row][column].getName() + "\t\t");
            }
            System.out.println();
        }
    }
}
