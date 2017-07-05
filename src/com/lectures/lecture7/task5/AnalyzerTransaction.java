package com.lectures.lecture7.task5;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by nimf8 on 03.07.2017.
 */
public abstract class AnalyzerTransaction {

    public static void transaction(Object object) throws InvocationTargetException, IllegalAccessException {
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().getSimpleName().equals("Transaction")) {
                    method.invoke(object);
                }
            }
        }
    }
}
