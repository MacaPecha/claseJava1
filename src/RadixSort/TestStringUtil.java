package RadixSort;

import java.util.ArrayList;
import java.util.Map;

public class TestStringUtil {
    public static void main(String[] args) {
        int[] arr = {4,28,132,3,61,5,44,66,567,976896};

        String[] sArr = StringUtil.convertArrayToString(arr);
        for (String x:sArr) {
            System.out.println(x);
        }

        String[] sArr2 = StringUtil.equalLong(sArr);
        for (String y:sArr2) {
            System.out.println(y);
        }

        int max = sArr2[1].length();

        Map<String, ArrayList<String>> lista = StringUtil.makeLists();

        for (String key: lista.keySet()) {
            System.out.println(key + " " + lista.get(key));
        }

        for (int i = 0; i < max; i++) {
            System.out.println("index que mando "+ (i+1));
            StringUtil.addStringToMap(lista, sArr2, (i+1));
            System.out.println(lista);
            for (String y:sArr2) {
                System.out.println(y);
            }

            StringUtil.iteratorLists(lista, sArr2);
            for (String y:sArr2) {
                System.out.println(y);
            }
        }
    }
}
