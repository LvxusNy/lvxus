package com.tdd.kata.isomorphic;

import java.util.HashMap;

public class Isomorphic {
    private final String one;
    private HashMap<Character, Character> map;

    public Isomorphic(String one) {
        this.one = one;
    }

    public boolean isIsomorphic(String other) {
        if (one.equals(other) || one.length() == 1) return true;
        if (one.length() != other.length()) return false;
        map = new HashMap<Character, Character>();
        for (int i = 0; i < one.length(); i++) {
            char oneChar = one.charAt(i);
            char otherChar = other.charAt(i);
            if (map.get(oneChar) !=null&&!map.get(oneChar).equals(otherChar)) return false;
            map.put(oneChar, otherChar);
        }
        return true;
    }
}
