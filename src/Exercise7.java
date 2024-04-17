//Напишите функцию, которая принимает строку в качестве аргумента и возвращает true,
//если строка является палиндромом (читается одинаково в обоих направлениях), и false в противном случае.
public class Exercise7 {
    public static void main(String[] args) {
        System.out.print(string("wow"));
    }
    public static boolean string(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equals(reversed.toString());
    }
}
