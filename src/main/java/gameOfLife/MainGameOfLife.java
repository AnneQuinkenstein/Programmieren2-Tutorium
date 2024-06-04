package gameOfLife;

public class MainGameOfLife {

    public static void main(String[] args) {
        System.out.println("Game of Life");
        Spielablauf spielablauf = new Spielablauf();
        spielablauf.simuliereGenerationen(10);
    }
}
