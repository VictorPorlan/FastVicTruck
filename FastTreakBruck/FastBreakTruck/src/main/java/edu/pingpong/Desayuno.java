package edu.pingpong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Desayuno {
    List<Item> lista = new ArrayList<Item>();
    private Float precio = 0f;

    public Desayuno() {
    }
    public void addItem(Item item){
        this.lista.add(item);
    }

    public List<Item> getLista() {
        return lista;
    }

    public void mostrarItems(){
        getLista().forEach(item -> System.out.println(item.toString()));
    }
    public float getCoste(){
        getLista().forEach(item -> precio += item.PVP());
        return this.precio;
        }
    }
