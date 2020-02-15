package com.zacheryirvin;

import java.util.HashMap;
import java.util.Map;

public class SpaceBody {
  private static int maxID = 0;
  private final String name;
  private final Map<String, Type> types = new HashMap<>(){
    {
      put("PLANET", new Type("PLANET"));
      put("STAR", new Type("STAR"));
      put("MOON", new Type("MOON"));
    }
  }; 
  private final Type type;
  private Map<String, SpaceBody> satellites;

  public SpaceBody(String name, String type) {
    this.name = name;
    this.type = this.types.get(type.toUpperCase());
    this.satellites = new HashMap<>();
  }

  public boolean getSatellites() {
    for(String s : satellites.keySet()) {
      System.out.println(satellites.get(s).getName());
    }
    return true;
  }

  public boolean addSatellite(SpaceBody body) {
    satellites.put(body.getName(), body);
    return true;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type.getType();
  } 

  @Override
  public String toString() {
    String returnVal = "Name: " + this.getName() + " Type: " + this.getType() + "\n";
    return returnVal;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }

    if((obj == null) || (obj.getClass() != this.getClass())) {
      return false;
    }

    String objName = ((SpaceBody) obj).getName();
    String objType = ((SpaceBody) obj).getType();

    if(objName.equals(this.getName()) && !objType.equals(this.getType())) {
      return false;
    }

    return true;

  }

  @Override
  public int hashCode() {
    return this.name.hashCode() + 57 + this.type.hashCode();
  }

}
