package CodeWars;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
    private static final Logger logger = Logger.getLogger(Logger.class.getName());

    public static void main(String[] args) {
        // Пример действий в программе
        doSomething();
        doAnotherThing();
    }

    private static void doSomething() {
        // Логирование информационного сообщения
        logger.log(Level.INFO, "Выполняется метод doSomething()");

        // Логирование предупреждающего сообщения
        logger.log(Level.WARNING, "Предупреждение: doSomething() может вызвать проблемы!");
    }

    private static void doAnotherThing() {
        // Логирование сообщения об ошибке
        logger.log(Level.SEVERE, "Ошибка: метод doAnotherThing() завершился неудачей");
        logger.log(Level.OFF,"Level off");
    }
}
