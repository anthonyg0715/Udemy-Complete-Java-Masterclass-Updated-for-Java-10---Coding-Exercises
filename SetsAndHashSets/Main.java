package com.anthony;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury",88);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Venus",255);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Earth",365);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Mars",687);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Saturn",10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);



//
//        HeavenlyBody pluto = new HeavenlyBody("Pluto",842);
//        planets.add(pluto);
//
        HeavenlyBody tempMoon = new Moon("Moon",27);
        solarSystem.put(tempMoon.getKey(),temp);
        tempMoon.addMoon(tempMoon);

        tempMoon = new Moon("Deimos",1.3);
        solarSystem.put(tempMoon.getKey(),temp);
        tempMoon.addMoon(tempMoon);

        tempMoon = new Moon("Phobos",0.3);
        solarSystem.put(tempMoon.getKey(),temp);
        tempMoon.addMoon(tempMoon);

        tempMoon = new Moon("Io",1.8);
        solarSystem.put(tempMoon.getKey(),temp);
        tempMoon.addMoon(tempMoon);

        tempMoon = new Moon("Europa",3.5);
        solarSystem.put(tempMoon.getKey(),temp);
        tempMoon.addMoon(tempMoon);

        tempMoon = new Moon("Ganymede",7.1);
        solarSystem.put(tempMoon.getKey(),temp);
        tempMoon.addMoon(tempMoon);

        tempMoon = new Moon("Callisto",16.7);
        solarSystem.put(tempMoon.getKey(),temp);
        tempMoon.addMoon(tempMoon);

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars",HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for(HeavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getKey());
        }

        System.out.println("Planets");
        for(HeavenlyBody hb : planets){
            System.out.println("\t" + hb.getKey());
        }

        HeavenlyBody pluto = new Planet("Pluto",842);
        planets.add(pluto);

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody hb : planets){
            moons.addAll(hb.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getKey());
        }

        System.out.println("=====================");
        for(HeavenlyBody hb : planets){
            System.out.println(hb);
        }

        //testing that equals is symmetric
        HeavenlyBody earth1 = new Planet("Earth",365);
        HeavenlyBody earth2 = new Planet("Earth",365);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        solarSystem.put(pluto.getKey(),pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("The Solar System Contains: ");
        for(HeavenlyBody hb : solarSystem.values()){
            System.out.println(hb);
        }
    }
}
