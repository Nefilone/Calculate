import java.util.HashMap;
import java.util.Map;

public class RomanNums {
    int local;

    public int check(String enterNum) throws MyException {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("II", 2);
        roman.put("III", 3);
        roman.put("IV", 4);
        roman.put("V", 5);
        roman.put("VI", 6);
        roman.put("VII", 7);
        roman.put("VIII", 8);
        roman.put("IX", 9);
        roman.put("X", 10);
        try {
            if (!roman.containsKey(enterNum)) {
                if (roman.containsValue(Integer.parseInt(enterNum))) {
                    return Integer.parseInt(enterNum);
                } else {
                    throw new MyException("Ошибка! Оба операнда должны быть числами в диапозоне от 1 до 10!");
                }
            } else {
                local++;
                return roman.get(enterNum);
            }
        }
        catch (NumberFormatException u) {throw new MyException("Ошибка! Оба операнда должны быть числами в диапозоне от 1 до 10!");}
    }

    public String transResult(Integer enterNum) throws MyException {
        Map<Integer, String> roman = new HashMap<>();
        roman.put(2, "II");
        roman.put(3, "III");
        roman.put(4, "IV");
        roman.put(5, "V");
        roman.put(6, "VI");
        roman.put(7, "VII");
        roman.put(8, "VIII");
        roman.put(9, "IX");
        roman.put(10, "X");
        roman.put(11, "XI");
        roman.put(12, "XII");
        roman.put(13, "XIII");
        roman.put(14, "XIV");
        roman.put(15, "XV");
        roman.put(16, "XVI");
        roman.put(17, "XVII");
        roman.put(18, "XVIII");
        roman.put(19, "XIX");
        roman.put(20, "XX");

        switch (local) {
            case 2:
                roman.get(enterNum);
                break;
            case 0:
               String.valueOf(enterNum);
                break;
            default: throw new MyException("Ошибка! Оба операнда должны быть либо римскими либо арабскими!");
        }
        return roman.get(enterNum);

    }
}
