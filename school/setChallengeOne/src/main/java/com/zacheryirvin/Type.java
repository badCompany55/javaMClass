package com.zacheryirvin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Type {
  private String name;
  private static final Set<String> availableTypes = new HashSet<>(){
    {
      add("PLANET");
      add("STAR");
      add("MOON");
    }
  };

  public Type(String name) {
    boolean nameCheck = availableTypes.contains(name.toUpperCase()) ? true : false;
    if(nameCheck) {
      this.name = name;
    } else {
      String[] types = new String[3];
      types = availableTypes.toArray(types);
      String convert = "";
      for(String s : types) {
        convert += s + ", ";
      }
      System.out.println("Error!! Available types are " + convert);
    }
  }

  public String getType() {
    return this.name;
  }
}
