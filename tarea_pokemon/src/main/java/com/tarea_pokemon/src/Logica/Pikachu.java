package com.tarea_pokemon.src.Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    public String atacarPlacaje() {
        return "Hola soy Pikachu y este es mi ataque placaje";
    }

    @Override
    public String atacarAraniazo() {
        return "Hola soy Pikachu y este es mi ataque arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Hola soy Pikachu y este es mi ataque mordisco";
    }

    @Override
    public String atacarImpactrueno() {
        return "Hola soy Pikachu y este es mi ataque impactrueno";
    }

    @Override
    public String atacarPunioTrueno() {
        return "Hola soy Pikachu y este es mi ataque puño trueno";
    }
}
