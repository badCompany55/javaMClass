package com.zacheryirvin;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    Map<String, String> languages = new HashMap<>();
    languages.put("Java", "a compiled high level, object-oriented language.");
    languages.put("Python", "a interpreted, object-oriented language with dynamic semantics.");
    languages.put("Algol", "an algorithmic language.");
    languages.put("BASIC", "a beginners all purpose language.");
    languages.put("Lisp", "There in lies madness.");

    if(languages.containsKey("Java")) {
      System.out.println("Java is already in the HashMap.");
    } else {
      System.out.println("Java has been added.");
      languages.put("Java", "a compiled high level, object-oriented language.");
    }

    for(String key : languages.keySet()) {
      String value = languages.get(key);
      System.out.println(key + ": " + value);
    }
  }
}
