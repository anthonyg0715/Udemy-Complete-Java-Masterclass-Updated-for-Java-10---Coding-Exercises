package com.anthony;

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod,BodyTypes.PLANET);
    }

    @Override
    public boolean addMoon(HeavenlyBody hb) {
        if(hb.getKey().getBodyType().equals(BodyTypes.MOON)){
            return super.addMoon(hb);
        }else{
            return false;
        }
    }
}
