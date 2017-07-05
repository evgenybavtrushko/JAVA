package com.lectures.lecture7.task6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by nimf8 on 05.07.2017.
 */
public abstract class ClassAnalyzerImproved {
    public static void analyze(Class cl) {
        Package p = cl.getPackage();
        System.out.println("package " + p.getName() + ";");

        Annotation[] annotations = cl.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("@" + annotation.annotationType().getSimpleName());
        }
        int modifiers = cl.getModifiers();
        System.out.print(getModifiers(modifiers));

        System.out.print("class " + cl.getSimpleName() + " ");
        System.out.print("extends " + cl.getSuperclass().getSimpleName() + " ");
        Class[] interfaces = cl.getInterfaces();
        for (int i = 0, size = interfaces.length; i < size; i++) {
            System.out.print(i == 0 ? "implements " : ", ");
            System.out.print(interfaces[i].getSimpleName());
        }
        System.out.println(" {");
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\t" + getModifiers(field.getModifiers())
                    + getType(field.getType()) + " " + field.getName() + ";");
        }
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.print("\t" + getModifiers(c.getModifiers()) +
                    cl.getSimpleName() + "(");
            System.out.print(getParameters(c.getParameterTypes()));
            System.out.println(") { }");
        }
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] annotations2 = m.getAnnotations();
            System.out.print("\t");
            for (Annotation a : annotations2)
                System.out.print("@" + a.annotationType().getSimpleName() + " ");
            System.out.println();
            System.out.print("\t" + getModifiers(m.getModifiers()) +
                    getType(m.getReturnType()) + " " + m.getName() + "(");
            System.out.print(getParameters(m.getParameterTypes()));
            System.out.println(") { }");
        }
        System.out.println("}");
    }

    static String getModifiers(int m) {
        String modifiers = "";
        if (Modifier.isPublic(m))
            modifiers += "public ";
        if (Modifier.isProtected(m))
            modifiers += "protected ";
        if (Modifier.isPrivate(m))
            modifiers += "private ";
        if (Modifier.isStatic(m))
            modifiers += "static ";
        if (Modifier.isAbstract(m))
            modifiers += "abstract ";
        return modifiers;
    }

    static String getType(Class clazz) {
        String type = clazz.isArray() ? clazz.getComponentType().getSimpleName() : clazz.getSimpleName();
        if (clazz.isArray()) type += "[]";
        return type;
    }

    static String getParameters(Class[] params) {
        String p = "";
        for (int i = 0, size = params.length; i < size; i++) {
            if (i > 0) p += ", ";
            p += getType(params[i]) + " param" + i;
        }
        return p;
    }
    public static void analyze(Object obj) {
        Class cl = obj.getClass();
        analyze(cl);

    }
}

