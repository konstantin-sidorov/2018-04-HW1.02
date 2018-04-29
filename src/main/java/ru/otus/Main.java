package ru.otus;


public class Main {
    public static void main(String[] args) throws IllegalAccessException{
        System.out.println("Размер Empty String:"+ObjectSizeCalculator.sizeOf(new String()));
        System.out.println("Размер Object:"+ObjectSizeCalculator.sizeOf(new Object()));
        System.out.println("Размер Array:"+ObjectSizeCalculator.sizeOf(new Object[0]));
    }
}
