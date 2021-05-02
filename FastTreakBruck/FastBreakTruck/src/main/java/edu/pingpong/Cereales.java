package edu.pingpong;

public abstract class Cereales implements Item{
    public Cereales() {
    }

    @Override
    public Packing empaquetado() {
            return new Caja();
    }

    @Override
    public String toString() {
        return "Item:" + nombre() +", Empaquetado:" + this.empaquetado().envoltorio() + ", Precio:" + PVP();
    }

}
