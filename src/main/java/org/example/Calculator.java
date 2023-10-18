package org.example;
//1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
//divide(), subtract(). Параметры этих методов – два числа разного типа (но необязательно разного между собой),
// над которыми должна быть произведена операция.
public class Calculator {

    public static <N extends Number> double sum(N a, N b){
        return a.doubleValue()+b.doubleValue();
    }
    public static <N extends Number> double multiply(N a, N b){
        return a.doubleValue()*b.doubleValue();
    }
    public static <N extends Number> double divide(N a, N b){
        return a.doubleValue()/b.doubleValue();
    }
    public static <N extends Number> double subtract(N a, N b){
        return a.doubleValue()-b.doubleValue();
    }
}
