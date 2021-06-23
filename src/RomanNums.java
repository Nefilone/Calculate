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

    public String transferResult(Integer num) throws MyException {
        Map<Integer, String> unitsRoman = new HashMap<>();
        unitsRoman.put(1, "I");
        unitsRoman.put(2, "II");
        unitsRoman.put(3, "III");
        unitsRoman.put(4, "IV");
        unitsRoman.put(5, "V");
        unitsRoman.put(6, "VI");
        unitsRoman.put(7, "VII");
        unitsRoman.put(8, "VIII");
        unitsRoman.put(9, "IX");

        Map<Integer, String> tensRoman = new HashMap<>();
        tensRoman.put(1, "X");
        tensRoman.put(2, "XX");
        tensRoman.put(3, "XXX");
        tensRoman.put(4, "XL");
        tensRoman.put(5, "L");
        tensRoman.put(6, "LX");
        tensRoman.put(7, "LXX");
        tensRoman.put(8, "LXXX");
        tensRoman.put(9, "XC");
        tensRoman.put(10, "C");

        if (num > 0) {
            if (num < 10) {
                return unitsRoman.get(num);
            } else {
                int spam = num / 10;
                int eggs = num % 10;
                if (eggs > 0) {
                    return String.format("%s%s", tensRoman.get(spam), unitsRoman.get(eggs));
                } else {
                    return tensRoman.get(spam);
                }
            }
        } else {
            throw new MyException("В системе счисления, использующей Римские цифры," +
                    " нуль и отрицательные значения отсутствуют!");
        }
    }

    public String checkResult(Integer enterNum) throws MyException {

        if(local == 2){
            return transferResult(enterNum);
        }
        else{
            if(local == 0){
                return String.valueOf(enterNum);
            }
            else{
                throw new MyException("Ошибка! Оба операнда должны быть либо римскими либо арабскими!");
            }
        }

        }
    }

