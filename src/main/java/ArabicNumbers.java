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
                case 2:
                    result = getIntegerOf2(result, subRomanChar);
                    break;
                case 3:
                    result = getIntegerOf3(result, subRomanChar);
                    break;
                default:
                    result = getIntegerOf4(result, subRomanChar);
                    break;
            }

        }

        return result.getSum();
    }

    private Result getIntegerOf1Symbol(Result result, char[] subRomanChar) {
        result.incSum((int) translateSymbols.get(subRomanChar[0]));
        result.incSymbolsRead(1);
        return result;
    }


    private Result getIntegerOf2(Result result, char[] romanChar) {

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        if (x.compareTo(y) >= 0) {
            result.incSum(x + y);
        }else {
            result.incSum(y - x);
        }
        result.incSymbolsRead(2);
        return result;
    }

    private Result getIntegerOf3(Result result, char[] romanChar) {

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        Integer z = (Integer) translateSymbols.get(romanChar[2]);

        if (x.compareTo(y) >= 0) {
            result.incSum(x + y + z);
            result.incSymbolsRead(3);
        }else if (x.compareTo(y) < 0) {
            result.incSum(y - x);
            result.incSymbolsRead(2);
        }

        return result;
    }

    private Result getIntegerOf4(Result result, char[] romanChar) {

        Integer x = (Integer) translateSymbols.get(romanChar[0]);

        Integer y = (Integer) translateSymbols.get(romanChar[1]);

        Integer z = (Integer) translateSymbols.get(romanChar[2]);

        Integer w = (Integer) translateSymbols.get(romanChar[3]);

        if(x.compareTo(y) == 0 && y.compareTo(z) == 0) {
            result.incSum(x + y + z);
            result.incSymbolsRead(3);
        }else if (x.compareTo(y) >= 0 && y.compareTo(z) == 0 && z.compareTo(w) == 0) {
            result.incSum(x+y+z+w);
            result.incSymbolsRead(4);
        }else {
            result = getIntegerOf3(result, romanChar);
        }
        return result;
    }

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

        public void incSum(int inc) {
            this.sum = sum + inc;
        }

        public void incSymbolsRead(int inc) {
            this.symbolsRead = symbolsRead + inc;
        }
    }
}
