package com.tarea_pokemon.src.Front;

import javax.swing.*;

public class CambiarPokemonWindow extends JFrame {

    public CambiarPokemonWindow() {

        setTitle("Cambiar Pokemon");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Imagen que usamos por ahora
        ImageIcon imagen = new ImageIcon(
            getClass().getResource(
                "/com/tarea_pokemon/src/Front/images/sprites/substitute.png"
            )
        );

        JLabel imagen1 = new JLabel(imagen);
        imagen1.setBounds(50, 50, 200, 200);

        JButton botonPokemon1 = new JButton("Pokémon 1");
        botonPokemon1.setBounds(50, 270, 200, 50);


        JLabel imagen2 = new JLabel(imagen);
        imagen2.setBounds(300, 50, 200, 200);

        JButton botonPokemon2 = new JButton("Pokémon 4");
        botonPokemon2.setBounds(300, 270, 200, 50);


        JLabel imagen3 = new JLabel(imagen);
        imagen3.setBounds(550, 50, 200, 200);

        JButton botonPokemon3 = new JButton("Pokémon 7");
        botonPokemon3.setBounds(550, 270, 200, 50);


        // Agregar al panel
        panel.add(imagen1);
        panel.add(botonPokemon1);

        panel.add(imagen2);
        panel.add(botonPokemon2);

        panel.add(imagen3);
        panel.add(botonPokemon3);

        setContentPane(panel);
    }
}
