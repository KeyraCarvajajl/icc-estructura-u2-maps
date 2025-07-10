import controllers.Ejercicios;
import controllers.Mapa;

public class App {
    public static void main(String[] args) {
        runMapExample();
        runEjerciciosExample();
    }

    private static void runMapExample() {
        System.out.println("Keyra Carvajal");
        System.out.println(">>> Ejecutando ejemplos de mapas...");

        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
        mapa.metodoComparable();
    }

    private static void runEjerciciosExample() {
        Ejercicios ejer = new Ejercicios();

        System.out.println("\n----ANAGRAMAS----");
        String s1 = "listen", s2 = "silent";
        System.out.println("areAnagrams(\"" + s1 + "\", \"" + s2 + "\") = "
            + Ejercicios.areAnagrams(s1, s2));

        int[] nums = {9, 2, 3, 6};
        int objetivo = 5;
        int[] par = ejer.sumatoriaDeDos(nums, objetivo);
        System.out.println("\n----SUMATORIA DE DOS----");
        System.out.print("sumatoriaDeDos([9,2,3,6], 5) = ");

        if (par != null) {
            System.out.println("[" + par[0] + "," + par[1] + "]");
        } else {
            System.out.println("null");
        }

        String texto = "hola";
        System.out.println("\n----CONTAR CARACTERES----");
        System.out.print("contarCaracteres(\"" + texto + "\") = ");
        ejer.contarCaracteres(texto);

        String p1 = "roma", p2 = "amor";
        System.out.println("\n----OTRO ANAGRAMA VÍA INSTANCIA----");
        System.out.println("sonAnagramas(\"" + p1 + "\", \"" + p2 + "\") = "
            + ejer.sonAnagramas(p1, p2));
    }
}
