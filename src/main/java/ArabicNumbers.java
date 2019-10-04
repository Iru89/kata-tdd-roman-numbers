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

        int length = romanNumber.length();
        Result result = new Result(0,0);

        while (result.getSymbolsRead() != length) {

            String subString = romanNumber.substring(result.getSymbolsRead(), length);
            char[] subRomanChar = subString.toCharArray();

            switch (subRomanChar.length) {
                case 1:
                    result = getIntegerOf1Symbol(result, subRomanChar);
                    break;
//                case 2:
//                    result = result + getIntegerOf2(subRomanChar)[0];
//                    read = read + getIntegerOf2(subRomanChar)[1];
//                    break;
//                case 3:
//                    result = result + getIntegerOf3(subRomanChar)[0];
//                    read = read + getIntegerOf3(subRomanChar)[1];
//                    break;
//                default:
//                    result = result + getIntegerOf4(subRomanChar)[0];
//                    read = read + getIntegerOf4(subRomanChar)[1];
//                    break;
            }

        }

        return result.sum;
    }

    private Result getIntegerOf1Symbol(Result result, char[] subRomanChar) {
        result.setSum(result.getSum() + (int) translateSymbols.get(subRomanChar[0]));
        result.setSymbolsRead(result.getSymbolsRead() + 1);
        return result;
    }


    //    private int[] getIntegerOf2(char[] romanChar) {
//    }
//        return result;
//        }
//            result[1] = 2;
//            result[0] = y-x;
//        }else {
//            result[1] = 2;
//            result[0] = x+y;
//        }else if(x.compareTo(y) >= 0){
//            result[1] = 1;
//            result[0] = x;
//        }else if(x.compareTo(y) >= 0 && y.compareTo(z) < 0) {
//            result[1] = 4;
//            result[0] = x+y+z+w;
//        }else if (x.compareTo(y) >= 0 && y.compareTo(z) >= 0 && z.compareTo(w) >= 0) {
//            result[1] = 3;
//            result[0] = x + y + z;
//        if(x.compareTo(y) == 0 && y.compareTo(z) == 0) {
//
//        Integer w = (Integer) translateSymbols.get(romanChar[3]);
//
//        Integer z = (Integer) translateSymbols.get(romanChar[2]);
//
//        Integer y = (Integer) translateSymbols.get(romanChar[1]);
//
//        Integer x = (Integer) translateSymbols.get(romanChar[0]);
//
//        int result[] = new int[2];
//
//    private int[] getIntegerOf4(char[] romanChar) {
//
//    }
//        return result;
//        }
//            result[1] = 1;
//            result[0] = x;
//        }else {
//            result[1] = 3;
//            result[0] = x+y+z;
//        if (x.compareTo(y) >= 0 && y.compareTo(z) >= 0) {
//
//
//        Integer z = (Integer) translateSymbols.get(romanChar[2]);
//
//        Integer y = (Integer) translateSymbols.get(romanChar[1]);
//
//        Integer x = (Integer) translateSymbols.get(romanChar[0]);
//
//        int result[] = new int[2];
//
//    private int[] getIntegerOf3(char[] romanChar) {
//
//    }
//        return result;
//        result[1] = 2;
//        }
//            result[0] = y-x;
//        }else {
//            result[0] = x+y;
//        if (x.compareTo(y) >= 0) {
//
//        Integer y = (Integer) translateSymbols.get(romanChar[1]);
//
//        Integer x = (Integer) translateSymbols.get(romanChar[0]);
//
//        int result[] = new int[2];
//
    public class Result {

        private int sum;
        private int symbolsRead;

        public Result(int sum, int symbolsRead) {
            this.sum = sum;
            this.symbolsRead = symbolsRead;
        }

        public int getSum() {
            return sum;
        }

        public int getSymbolsRead() {
            return symbolsRead;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public void setSymbolsRead(int symbolsRead) {
            this.symbolsRead = symbolsRead;
        }
    }
}
