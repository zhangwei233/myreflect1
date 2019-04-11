package com.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetArrayList {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类 类型
        Class<?> clazz = Class.forName("java.util.ArrayList");

        //获取包名
        Package pkg = clazz.getPackage();
        String pkgName = pkg.getName();
        System.out.println(pkgName);

        //获取访问修饰符
        int mod = clazz.getModifiers();
        String modStr = Modifier.toString(mod);
        if (Modifier.isInterface(mod))
            System.out.print(modStr);
        else
            System.out.print(modStr + " class ");
        //获取类名
        String className = clazz.getSimpleName();
        System.out.print(className);

        //获取父类
        Class<?> supClz = clazz.getSuperclass();
        if (supClz != null)
            System.out.print(" extends " + supClz.toGenericString());
        //获取接口
        Class<?>[] ifs = clazz.getInterfaces();
        if (ifs != null && ifs.length != 0) {
            System.out.print(" implements");
            for (Class<?> ifName : ifs)
                System.out.print(" " + ifName);
        }
        //获取属性
        System.out.println("获取属性");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            int fie1 = field.getModifiers();
            String fie = Modifier.toString(mod);

            System.out.print(" " + fie);
            Class<?> fieldType = field.getType();
            System.out.println(" " + fieldType);
            String fieldName = field.getName();
            System.out.println(" " + fieldName);
        }
        //获取方法
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("获取方法");
        for (Method method : methods) {
            int fmethod = method.getModifiers();
            String fie = Modifier.toString(fmethod);
            System.out.println(" " + fie);
            Class<?> methodType = method.getReturnType();
            System.out.println(" " + methodType);
            String methodName = method.getName();
            System.out.println(" " + methodName);
            Class<?>[] pts = method.getParameterTypes();
            for (Class<?> p : pts) {
                System.out.println(" " + p);
                Class<?>[] ets = method.getExceptionTypes();
                for (Class<?> e : ets) {
                    System.out.println(" " + e);

                }
            }
            // 获取构造方法
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("构造方法的访问修饰符：");
            for (Constructor constructor : constructors) {
                //构造方法的访问修饰符
                int fconstructor = constructor.getModifiers();
                String fie2 = Modifier.toString(fconstructor);
                System.out.println(" " + fie2);
            }

            System.out.println("构造方法的名称：");
            for (Constructor constructor : constructors) {
                //构造方法的名称：
                String constructorName = constructor.getName();
                System.out.println(" " + constructorName);
            }


            System.out.println("构造方法的参数类型：");
            for (Constructor constructor : constructors) {
                //构造方法的参数类型：
                Class<?>[] pts1 = constructor.getParameterTypes();
                for (Class<?> p : pts1) {
                    System.out.println(" " + p);
                }
            }
            //外部类
            System.out.println("外部类:");
            Class<?> outClz = clazz.getDeclaringClass();
            System.out.println(" " + outClz);

            //内部类
            System.out.println("内部类:");
            Class<?>[] innerClz = clazz.getDeclaredClasses();
            for (Class<?> c : innerClz) {
                System.out.println(" " + c);
            }
        }

    }
}
