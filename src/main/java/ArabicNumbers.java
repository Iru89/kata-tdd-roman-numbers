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
                    result = addValueOfSymbol(result, subRomanChar);
                    break;
                default:
                    result = addOrSubtractValueOfSymbol(result, subRomanChar);
                    break;
            }

        }

        return result;
    }

    private int addValueOfSymbol(int result, char[] subRomanChar) {

        result = result + (int) translateSymbols.get(subRomanChar[0]);

        return result;
    }


    private int addOrSubtractValueOfSymbol(int result, char[] romanChar) {

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        if (x.compareTo(y) >= 0) {
            result = result + x;
        }else {
            result = result - x;
        }

        return result;
    }


//    public int convertToArabicReduce(String romanNumber) {
//
//        String[] reverseArray = Arrays.stream(romanNumber.split(""))
//                .reduce((acc, idd) -> idd + acc)
//                .get()
//                .split("");
//        AtomicReference<Integer> oldValue = new AtomicReference<>(0);
//
//        // este reduce te da la logica que tenias dentro del for.
//        return Arrays.stream(reverseArray)
//             .map(number -> translateSymbols.get(number.charAt(0)))
//             .reduce(0, (acc, idd) -> {
//                 if (idd >= oldValue.get()) {
//                     oldValue.set(idd);
//                     return acc + idd;
//                 }
//                 return acc - idd;
//             });
//
//    }

}
