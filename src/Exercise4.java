//Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково. Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.
//Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.

public class Exercise4 {
    // Метод для проверки, является ли число палиндромом
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        int left = 0;
        int right = str.length() - 1;

        // Сравниваем символы с обеих сторон числа
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int maxPalindrome = 0;
        int factor1 = 0;
        int factor2 = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome) {
                    maxPalindrome = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        System.out.println("Наибольший палиндром, являющийся произведением двух трехзначных чисел:");
        System.out.println(factor1 + " * " + factor2 + " = " + maxPalindrome);
    }
}
