package com.lectures.lecture7.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by nimf8 on 03.07.2017.
 */
public abstract class  ClassAnalyzer {
    public static void analyze(Class cl) {
            Field[] allFields = cl.getDeclaredFields();
            for (Field field : allFields) {
                Class fieldType = field.getType();
                System.out.print("Имя поля = " + field.getName());
                System.out.println("   Тип поля = " + fieldType.getName());
            }
            Method[] allMethod = cl.getDeclaredMethods();
            for (Method method : allMethod) {
                System.out.print("Имя метода = " + method.getName());
                System.out.println("   Возвращаемый тип = " + method.getReturnType().getName());
            }
            Constructor[] constructors = cl.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.print(constructor.getName());
                Class[] paramTypes = constructor.getParameterTypes();
                for (Class paramType : paramTypes) {
                    System.out.print("  " + paramType.getName() + " ");
                }
            }
        System.out.println();
            Annotation[] annotations = cl.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("Аннотации класса " + annotation.annotationType().getSimpleName());
            }
        System.out.println();
        }
    public static void analyze(Object obj){
        Class cl = obj.getClass();
        analyze(cl);

}
}

