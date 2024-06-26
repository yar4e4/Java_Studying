//Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
//
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
public class Exercise2 {
    public static void main(String[] args) {
        int prev = 1;
        int current = 2;
        int sum = 0;

        while (current <= 4000000) {
            if (current % 2 == 0) {
                sum += current;
            }
            int next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("Сумма всех четных элементов ряда Фибоначчи, не превышающих 4 миллиона: " + sum);
    }
}

