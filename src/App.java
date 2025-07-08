import controllers.Mapa;

public class App {
    public static void main(String[] args) {
        runMapExample();
    }

    private static void runMapExample() {
        System.out.println(">>> Ejecutando ejemplos de mapas...");

        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
        mapa.metodoComparable();
    }
}
