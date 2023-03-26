//18.	Write a Java program to remove all occurrences of a character from string
package com.assignment;

public class RemoveAllOccurencesOfCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        String result = str.replaceAll(Character.toString(ch), "");
        System.out.println("Original String: " + str);
        System.out.println("String with character " + ch + " removed: " + result);
    }
}

