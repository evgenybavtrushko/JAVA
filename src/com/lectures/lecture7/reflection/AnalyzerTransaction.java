package com.lectures.lecture7.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


/**
 * Created by nimf8 on 03.07.2017.
 */
public abstract class AnalyzerTransaction {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        AnalyzerTransaction.transaction(test2);
    }
    public static void transaction(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getSimpleName());
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getSimpleName());
                if (annotation.annotationType().getSimpleName().equals("Transaction")) {
                    System.out.println("Transaction is started");
                    System.out.println("Transaction is ended");
                }
            }
        }
    }
}
