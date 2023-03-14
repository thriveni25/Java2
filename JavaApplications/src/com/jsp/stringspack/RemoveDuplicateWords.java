package com.jsp.stringspack;

import java.util.HashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String[] input = {"Java", "Python", "Java", "C", "C++", "Python"};
        HashSet<String> set = new HashSet<>();
        for (String str : input) {
             set.add(str);
        }
        
        for (String str : set) {
            System.out.println(str);
        }
    }
}

