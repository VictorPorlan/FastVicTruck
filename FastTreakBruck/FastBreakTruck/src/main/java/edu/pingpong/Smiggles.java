package edu.pingpong;

public class Smiggles extends Cereales{
    private final String nombre = "Smiggles";
    private final Float pvp = 50f;

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Float PVP() {
        return pvp;
    }
}
