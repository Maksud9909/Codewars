package LeetCode;

import java.util.Stack;

// {}[]()
public class ValidParentheses {


     public boolean isValid(String str) {
         Stack<Character> stack = new Stack<>();

         for (char ch : str.toCharArray()) {
             // Если это открывающая скобка, добавляем в стек
             if (ch == '(' || ch == '{' || ch == '[') {
                 stack.push(ch);
             } else {
                 // Если это закрывающая скобка
                 if (stack.isEmpty()) {
                     return false; // Нет соответствующей открывающей скобки
                 }

                 char top = stack.pop(); // Берем верхнюю открывающую скобку
                 // Проверяем, соответствуют ли пары скобок
                 if ((ch == ')' && top != '(') ||
                         (ch == '}' && top != '{') ||
                         (ch == ']' && top != '[')) {
                     return false; // Неверная пара
                 }
             }
         }

         // Если стек пуст, все скобки закрыты правильно
         return stack.isEmpty();
     }
}
