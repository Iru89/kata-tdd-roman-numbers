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

        for (int i = 0; i < romanNumber.length(); i++) {

            String subString = romanNumber.substring(i, romanNumber.length());
            char[] subRomanChar = subString.toCharArray();

            switch (subRomanChar.length) {
                case 1:
                    result = getIntegerOf1Symbol(result, subRomanChar);
                    break;
                default:
                    result = getIntegerOf2(result, subRomanChar);
                    break;
            }

        }

        return result;
    }

    private int getIntegerOf1Symbol(int result, char[] subRomanChar) {
        result = result + (int) translateSymbols.get(subRomanChar[0]);

        return result;
    }


    private int getIntegerOf2(int result, char[] romanChar) {

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        if (x.compareTo(y) >= 0) {
            result = result + x;
        }else {
            result = result - x;
        }

        return result;
    }

}
