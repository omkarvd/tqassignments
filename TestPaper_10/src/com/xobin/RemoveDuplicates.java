package com.xobin;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<Integer>();
        ArrayList<Integer> updatedList = new ArrayList<Integer>();
        // Add input elements to the original list
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(4);
        originalList.add(5);
        // Remove duplicates by iterating over the original list
        for (Integer element : originalList) {
            if (!updatedList.contains(element)) {
                updatedList.add(element);
            }
        }
        // Print the updated list using an iterator
        Iterator<Integer> itr = updatedList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

