
package com.tarea_pokemon.src.Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    @Override
    public String atacarPlacaje() {
        return "Hola soy Bulbasaur y este es mi ataque placaje";
    }

    @Override
    public String atacarAraniazo() {
        return"Hola soy Bulbasaur y este es mi ataque arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Hola soy Bulbasaur y este es mi ataque mordisco";
    }

    @Override
    public String atacarDrenaje() {
        return "Hola soy Bulbasaur y este es mi ataque drenaje";
    }

    @Override
    public String atacarParalizar() {
        return "Hola soy Bulbasaur y este es mi ataque paralizar";
    }
    
}
