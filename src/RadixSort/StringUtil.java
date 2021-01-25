package RadixSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringUtil {
    public static String[] convertArrayToString(int[] arr){
        String[] sArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sArr[i] = Integer.toString(arr[i]); //convierto cada elemento a String
        }
        return sArr;
    }

    public static String[] equalLong(String[] sArr){
        String[] sArrEqual = new String[sArr.length];
        int max = 0;
        for (int i = 0; i < sArr.length; i++) { //obtengo la cantidad de dígitos del número más grande
            if (max < sArr[i].length()) {
                max = sArr[i].length();
            }
        }
        for (int i = 0; i < sArr.length; i++) {
            int num = Integer.parseInt(sArr[i]); //convierto a entero el elemento
            //completo con ceros el elemento en base a los digitos del numero mas grande y lo guardo como
            sArrEqual[i] = String.format("%0" + max + "d",num);
        }
        return sArrEqual;
    }

    public static Map<String, ArrayList<String>> makeLists(){
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("L"+i, new ArrayList<>()); // creo las listas vacias
        }
        return map;
    }

    public static void addStringToMap(Map<String, ArrayList<String>> map, String[] sArr, int index){
        for (int i = 0; i < sArr.length; i++) {
            String x = sArr[i]; //obtengo el elemento del array
            String key = "L" + x.charAt(x.length()-index); //obtengo la key en base al digito que estoy buscando en la iteracion
            ArrayList<String> al = map.get(key); //obtengo el array de esa key
            al.add(sArr[i]); //agrego el elemento del array en el arrayList correspondiente
            sArr[i]=""; // limpio el elemento en la posicion del array
        }
    }

    public static void iteratorLists (Map<String, ArrayList<String>> map, String[] sArr) {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            ArrayList<String> al = map.get("L" + i);
            for (String x : al) {
                sArr[index] = x;
                index++;
            }
            map.put("L" + i, new ArrayList<>());
        }
    }
}
