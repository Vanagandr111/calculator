package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // В данной реализации b будет равен 0, что приведет к попытке деления на ноль в следующей строке.
        // Это вызовет ArithmeticException, если не обработать этот случай в самом операторе `devide`.
        // Мы уже добавили проверку на деление на ноль в оператор `devide`, поэтому исключения не произойдет,
        // но результатом будет 0 с выводом сообщения об ошибке.
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}