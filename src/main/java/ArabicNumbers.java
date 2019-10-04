import java.util.HashMap;

public class ArabicNumbers {

    private final static HashMap translateSymbols = createHash();

    private static HashMap createHash() {
        HashMap<Character, Integer> result = new HashMap<>();
        result.put('I', 1);
        result.put('V', 5);
        result.put('X', 10);
        result.put('L', 50);
        result.put('C', 100);
        result.put('D', 500);
        result.put('M', 1000);
        return result;

    }

    public int convertToArabic(String romanNumber) {

        int result = 0;
        int read = 0;
        int length = romanNumber.length();

        while (read != length) {

            String subString = romanNumber.substring(read, length);
            char[] subRomanChar = subString.toCharArray();

            switch (subRomanChar.length) {
                case 1:
                    result = result + (int) translateSymbols.get(subRomanChar[0]);
                    read = read + 1;
                    break;
                case 2:
                    result = result + getIntegerOf2(subRomanChar)[0];
                    read = read + getIntegerOf2(subRomanChar)[1];
                    break;
                case 3:
                    result = result + getIntegerOf3(subRomanChar)[0];
                    read = read + getIntegerOf3(subRomanChar)[1];
                    break;
                default:
                    result = result + getIntegerOf4(subRomanChar)[0];
                    read = read + getIntegerOf4(subRomanChar)[1];
                    break;
            }

        }

        return result;
    }

    private int[] getIntegerOf2(char[] romanChar) {

        int result[] = new int[2];

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        if (x.compareTo(y) >= 0) {
            result[0] = x+y;
        }else {
            result[0] = y-x;
        }
        result[1] = 2;
        return result;
    }

    private int[] getIntegerOf3(char[] romanChar) {

        int result[] = new int[2];

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        Integer z = (Integer) translateSymbols.get(romanChar[2]);


        if (x.compareTo(y) >= 0 && y.compareTo(z) >= 0) {
            result[0] = x+y+z;
            result[1] = 3;
        }else {
            result[0] = x;
            result[1] = 1;
        }
        return result;
    }

    private int[] getIntegerOf4(char[] romanChar) {

        int result[] = new int[2];

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        Integer z = (Integer) translateSymbols.get(romanChar[2]);

        Integer w = (Integer) translateSymbols.get(romanChar[3]);

        if(x.compareTo(y) == 0 && y.compareTo(z) == 0) {
            result[0] = x + y + z;
            result[1] = 3;
        }else if (x.compareTo(y) >= 0 && y.compareTo(z) >= 0 && z.compareTo(w) >= 0) {
            result[0] = x+y+z+w;
            result[1] = 4;
        }else if(x.compareTo(y) >= 0 && y.compareTo(z) < 0) {
            result[0] = x;
            result[1] = 1;
        }else if(x.compareTo(y) >= 0){
            result[0] = x+y;
            result[1] = 2;
        }else {
            result[0] = y-x;
            result[1] = 2;
        }
        return result;
    }
}
