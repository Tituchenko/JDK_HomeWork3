package org.example;

import java.util.Arrays;

//1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
//divide(), subtract(). Параметры этих методов – два числа разного типа (но необязательно разного между собой),
// над которыми должна быть произведена операция.
//2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
// и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
// элементы одного типа.
//3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы
// getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода
// toString(), возвращающее строковое представление пары.
public class Main {
    public static void main(String[] args) {
//        Задача 1
        System.out.println(Calculator.sum(5,5));
        System.out.println(Calculator.sum(4.2,6.7));
        System.out.println(Calculator.sum(5,6.7));
        System.out.println(Calculator.sum(5f,6));
        long a=45l;
        float b=56f;
        System.out.println(Calculator.divide(a,b));

//        Задача 2
        Integer[] arr1={1,2,3};
        Integer[] arr2={1,2,2};
        Integer[] arr3={1,2,3};
        String[] arr4={"кот","собака","дельфин"};
        String[] arr5={"кот","собака","хомяк"};
        String[] arr6={"кот","собака","дельфин"};

        System.out.println(compareArrays(arr1,arr2));
        System.out.println(compareArrays(arr1,arr3));
        System.out.println(compareArrays(arr4,arr5));
        System.out.println(compareArrays(arr4,arr6));
        System.out.println(compareArrays(arr1,arr6));

//Задача 3
        Pair<Integer,String> pair = new Pair<>(5,"пять");
        System.out.println(pair);
    }
    public static <T> boolean compareArrays(T[] a,T[] b){
        if (a.length!=b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}