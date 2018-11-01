package com.anthony;

public class Moon extends HeavenlyBody{

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }

    @Override
    public boolean addMoon(HeavenlyBody hb) {
        return super.addMoon(hb);
    }
}
