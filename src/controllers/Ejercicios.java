package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma cantidad,
     * sin importar el orden.
     *
     * Ejemplo:
     *   str1 = "listen", str2 = "silent"  → true
     *   str1 = "hello",  str2 = "bello"   → false
     */
    public static boolean areAnagrams(String str1, String str2) {
        // si las longitudes difieren, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // contamos la frecuencia de cada carácter en str1
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // restamos la frecuencia con los caracteres de str2
        for (char c : str2.toCharArray()) {
            Integer cuenta = freq.get(c);
            if (cuenta == null || cuenta == 0) {
                // apareció un carácter extra o en exceso en str2
                return false;
            }
            freq.put(c, cuenta - 1);
        }

        // si queda alguna cuenta distinta de 0, no son anagramas
        for (int restante : freq.values()) {
            if (restante != 0) {
                return false;
            }
        }

        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números cuya suma sea igual al objetivo.
     * Se asume que hay una sola solución; si no se encuentra, retorna null.
     *
     * Ejemplo:
     *   nums = [9,2,3,6], objetivo = 5 → [1,2]  (2 + 3 = 5)
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        // mapa de valor → índice
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            // si ya vimos el complemento, devolvemos par de índices
            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }
            // guardamos el número actual para futuras comprobaciones
            mapa.put(nums[i], i);
        }
        // no encontrado
        return null;
    }

    /**
     * Cuenta la frecuencia de cada caracter en la cadena recibida y
     * muestra el resultado por consola.
     *
     * Ejemplo:
     *   texto = "hola" → {h=1, o=1, l=1, a=1}
     */
    public void contarCaracteres(String texto) {
        Map<Character, Integer> freq = new HashMap<>();
        // recorremos cada carácter y actualizamos su conteo
        for (char c : texto.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        // imprimimos el mapa de frecuencias
        System.out.println(freq);
    }

    /**
     * Verifica si dos palabras son anagramas.
     * Deben contener las mismas letras con la misma frecuencia.
     *
     * Ejemplo:
     *   palabra1 = "roma", palabra2 = "amor"  → true
     */
    public boolean sonAnagramas(String palabra1, String palabra2) {
        // reutilizamos la implementación anterior
        return areAnagrams(palabra1, palabra2);
    }
}
