package com.zacheryirvin;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
  private final String name;
  private final double orbitalPeriod;
  private final Set<HeavenlyBody> satellites;

  public HeavenlyBody(String name, double orbitalPeriod) {
    this.name = name;
    this.orbitalPeriod = orbitalPeriod;
    this.satellites = new HashSet<>();
  }

  public String getName() {
    return this.name;
  }

  public double getOrbitalPeriod() {
    return this.orbitalPeriod;
  }

  public boolean addMoon(HeavenlyBody moon) {
    return this.satellites.add(moon);
  }

  public Set<HeavenlyBody> getSatellites() {
    return new HashSet<>(this.satellites);
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }

    if((obj == null) || (obj.getClass() != this.getClass())) {
      return false;
    }

    String objName = ((HeavenlyBody) obj).getName();
    return this.name.equals(objName);
  }

  @Override
  public int hashCode() {
    return this.name.hashCode() + 57;
  }

}
