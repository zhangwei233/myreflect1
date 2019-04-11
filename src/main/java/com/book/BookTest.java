package com.book;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BookTest {
    public static void main(String[] args) throws Exception{
        Book book = new Book();
        Class<?> clazz = Class.forName("com.book.Book");
        Object book1 =clazz.newInstance();
        System.out.println(book1);
        Constructor<?> constructor =clazz.getDeclaredConstructor(int.class,String.class,double.class,String.class);
        Object book2 =constructor.newInstance(1,"zw",100.5,"tom");
        System.out.println(book2);
        Field field= clazz.getDeclaredField("name");
        field.setAccessible(true);
        // 写属性
        field.set(book, "zw");
        // 读属性
        Object username = field.get(book);
        System.out.println(username);

        Method setNameMethod = clazz.getMethod("setName", String.class);
        Method getNameLengthMethod = clazz.getDeclaredMethod("getlenght",String.class);
        setNameMethod.invoke(book, "tom");
        System.out.println(book);

        getNameLengthMethod.setAccessible(true);

        Object namelength = getNameLengthMethod.invoke(book,"tom");
        System.out.println(namelength);
    }
}
