package codingBat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer * integer + 10) // Квадрат каждого числа
                .filter(integer -> integer % 10 != 5 && integer % 10 != 6) // Исключаем числа, оканчивающиеся на 5 или 6
                .collect(Collectors.toList()); // Собираем результат в список
    }


}
