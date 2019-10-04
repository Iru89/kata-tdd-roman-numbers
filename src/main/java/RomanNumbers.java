import java.util.Arrays;
import java.util.List;

public class RomanNumbers {

    private final static List<String> romanSymbols = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertToRoman(Integer naturalArabicNumber) {

        char[] numberChar = naturalArabicNumber.toString().toCharArray();
        int inc = 0;
        String result = "";

        for (int i = numberChar.length - 1; i >= 0 ; i--) {
            String roman = generic(Character.getNumericValue(numberChar[i]), 0 + inc, 1 + inc, 2 + inc);
            result = roman + result;
            inc = inc + 2;

        }

        return result;

    }

    private String generic(int ten, int symbolX, int symbolY, int symbolZ) {

        switch (ten){
            case 4:
                return romanSymbols.get(symbolX) + romanSymbols.get(symbolY);
            case 9:
                return romanSymbols.get(symbolX) + romanSymbols.get(symbolZ);
        }

        if(ten <= 3) {
            return addSimbolfrom("", 0, ten, romanSymbols.get(symbolX));
        }

        if(ten <= 8) {
            return addSimbolfrom(romanSymbols.get(symbolY), 5, ten, romanSymbols.get(symbolX));
        }

        return null;
    }

    private String addSimbolfrom(String initialRomanNumber, int initialArabicNumber, int arabicNumber, String addSymbol) {
        StringBuilder resultRomanNumber = new StringBuilder(initialRomanNumber);
        for (int i = initialArabicNumber; i < arabicNumber; i++) {
            resultRomanNumber.append(addSymbol);
        }
        return resultRomanNumber.toString();
    }
}
