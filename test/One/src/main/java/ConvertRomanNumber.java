import java.util.TreeMap;

public class ConvertRomanNumber {
    private final TreeMap<Integer, String> numerals = new TreeMap();

    public ConvertRomanNumber(){
        numerals.put(1, "I");
        numerals.put(4, "IV");
        numerals.put(5, "V");
        numerals.put(9, "IX");
        numerals.put(10, "X");
        numerals.put(40, "XL");
        numerals.put(50, "L");
        numerals.put(90, "XC");
        numerals.put(100, "C");
        numerals.put(400, "CD");
        numerals.put(500, "D");
        numerals.put(900, "CM");
        numerals.put(1000, "M");
    }

    public String arabicToRoman(int number) {
        if (number < 1 || number > 3999)
            throw new IllegalArgumentException("Arabic number cannot be lower than 1 or greater than 3999");
        int l = numerals.floorKey(number);
        if (number == l) {
            return numerals.get(number);
        }
        return numerals.get(l) + arabicToRoman(number - l);
    }
}
