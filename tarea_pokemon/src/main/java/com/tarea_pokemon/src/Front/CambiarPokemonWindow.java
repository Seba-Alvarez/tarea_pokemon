package com.tarea_pokemon.src.Front;

import javax.swing.*;

public class CambiarPokemonWindow extends JFrame {

    String[] nombres = {
        "Pikachu",
        "Bulbasaur",
        "Charmander",
        "Squirtle"
    };

    String[] rutas = {
        "/com/tarea_pokemon/src/Front/images/sprites/pikachu.png",
        "/com/tarea_pokemon/src/Front/images/sprites/bulbasaur.png",
        "/com/tarea_pokemon/src/Front/images/sprites/charmander.png",
        "/com/tarea_pokemon/src/Front/images/sprites/squirtle.png"
    };

    public CambiarPokemonWindow() {

        setTitle("Cambiar Pokemon");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        int posicion = 0;

        for (int i = 0; i < nombres.length; i++) {

            // No mostrar el Pokémon que ya está en combate
            if (nombres[i].equals(MainWindow.pokemonActual)) {
                continue;
            }

            ImageIcon imagen = new ImageIcon(
                getClass().getResource(rutas[i])
            );

            JLabel labelImagen = new JLabel(imagen);

            int x = 50 + (posicion * 250);

            labelImagen.setBounds(x, 50, 200, 200);

            JButton boton = new JButton(nombres[i]);
            boton.setBounds(x, 270, 200, 50);

            // Guardamos los valores para el botón
            String nombre = nombres[i];
            String ruta = rutas[i];

            boton.addActionListener(e -> {

                MainWindow.cambiarPokemon(nombre, ruta);

                dispose();
            });

            panel.add(labelImagen);
            panel.add(boton);

            posicion++;
        }

        setContentPane(panel);
    }
}