package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    /**
     * Собираем в карту - Map<Character, Integer> - ключ - символ, значение - сколько этот символ раз встречается в слове
     * @param string строка, которую разберем для карты
     * @return возвращает карту
     */

    public static Map<Character, Integer> map(String string) {
        Map<Character, Integer> mapList = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!mapList.containsKey(string.charAt(i))) {
                mapList.put(string.charAt(i), 1);
            } else {
                int v = mapList.get(string.charAt(i));
                v++;
                mapList.put(string.charAt(i), v);
            }
        }
        return mapList;
    }

    /**
     *  Метод перебирает второе слово и  сверяет его с картой
     *       - если символа такого вообще нет - сразу вернуть false
     *       - если символ есть и ассоциированное с ним значение равно 1 -  удалить такую пару
     *       - если символ есть и ассоциированное с ним значение больше 1 - уменьшаем значение на 1
     *      Если после таких манипуляций окажется что карта пустая - значит слова одинаковые.
     * @param left исходная строка
     * @param right сравниваемая строка
     * @return возвращает false, если хоть один символ отсутствует , true - если карту пустая
     */
    public static boolean eq(String left, String right) {
        Map<Character, Integer> list = map(left);
        for (int i = 0; i < right.length(); i++) {
            if (!list.containsKey(right.charAt(i))) {
                return false;
            }
            if (list.containsKey(right.charAt(i)) && list.get(right.charAt(i)) == 1) {
                list.remove(right.charAt(i));
            } else {
                int v = list.get(right.charAt(i));
               v--;
                list.put(right.charAt(i), v);
            }
        }
        return list.isEmpty();
    }
}
