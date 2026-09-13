package com.tarea_pokemon.src.Logica;

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    public abstract String atacarPlacaje();
    public abstract String atacarAraniazo();
    public abstract String atacarMordisco();
}
