package com.anthony;

public class DwarfPlanet extends HeavenlyBody{

    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }

    @Override
    public boolean addMoon(HeavenlyBody hb) {
        if(hb.getKey().getBodyType().equals(BodyTypes.DWARF_PLANET)){
            return super.addMoon(hb);
        }else{
            return false;
        }
    }
}
