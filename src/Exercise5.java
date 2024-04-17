//Напишите функцию, которая принимает целое число в качестве аргумента и возвращает его факториал.
//Факториал числа n - это произведение всех положительных целых чисел от 1 до n
public class Exercise5 {
    public static void main(String[] args) {

        System.out.print(square(8));
    }

    public static int square(int a) {
        int factorial = 1;
        for (int i = 1; i <= (a - 1); i++) {
            factorial += i * factorial;
        }
        return factorial;
    }
}