/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.zacheryirvin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    // private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    // private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
      // Set<Integer> squares = new HashSet<>();
      // Set<Integer> cubes = new HashSet<>();
//
      // for(int i = 1; i <=100; i++) {
        // squares.add(i*i);
        // cubes.add(i*i*i);
      // }
//
      // for(Integer i : cubes) {
        // System.out.println(i);
      // }

      Set<String> setOne = new HashSet<>();
      Set<String> setTwo = new HashSet<>();

      String sOne = "This is the first sentence"; 
      String sTwo = "This happens to be the second sentence";

      String[] arrOne = sOne.split(" ");
      String[] arrTwo = sTwo.split(" ");

      setOne.addAll(Arrays.asList(arrOne));
      Set<String> oneClone = new HashSet<>(setOne);
      oneClone.removeAll(Arrays.asList(arrTwo));

      System.out.println(setOne);
      System.out.println(oneClone);

      // for(String s : setOne) {
        // System.out.println(s);
      // }


      // HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
      // solarSystem.put(temp.getName(), temp);
      // planets.add(temp);
      // HeavenlyBody temp1 = new HeavenlyBody("Venus", 225);
      // solarSystem.put(temp1.getName(), temp1);
      // planets.add(temp1);
//
      // HeavenlyBody temp2 = new HeavenlyBody("Earth", 365);
      // if(planets.add(temp2)) {
        // solarSystem.put(temp2.getName(), temp2);
      // }
//
      // HeavenlyBody temp3 = new HeavenlyBody("Earth", 400);
      // if(planets.add(temp3)) {
        // solarSystem.put(temp3.getName(), temp3);
      // }
//
      // HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
      // HeavenlyBody tempMoon1 = new HeavenlyBody("Yet Another Moon", 27);
      // HeavenlyBody tempMoon2 = new HeavenlyBody("Another Moon", 27);
      // solarSystem.put(tempMoon.getName(), tempMoon);
      // solarSystem.put(tempMoon.getName(), tempMoon1);
      // solarSystem.put(tempMoon.getName(), tempMoon2);
      // temp2.addMoon(tempMoon);
      // temp2.addMoon(tempMoon1);
      // temp2.addMoon(tempMoon2);
//
      // System.out.println("Planets\n");
      // for(HeavenlyBody p : planets) {
        // System.out.println(p.getName());
      // }
//
      // HeavenlyBody earth = solarSystem.get("Earth");
      // for(HeavenlyBody m : earth.getSatellites()) {
        // System.out.println(m.getName());
      // }
    }
}
