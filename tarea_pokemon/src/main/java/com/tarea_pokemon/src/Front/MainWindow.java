package com.tarea_pokemon.src.Front;

import javax.swing.*;
import com.tarea_pokemon.src.Logica.Pikachu;
import java.awt.*;

public class MainWindow {

    // Pokémon que está actualmente en combate
    static String pokemonActual = "Pikachu";
    static Image imagenPokemonActual;

    static JPanel panel;

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Mi ventana");

        ventana.setSize(1000, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cargar Pikachu al principio
        imagenPokemonActual = new ImageIcon(
            MainWindow.class.getResource(
                "/com/tarea_pokemon/src/Front/images/sprites/pikachu.png"
            )
        ).getImage();

        panel = new JPanel() {

            private Image background;
            private Image enemy;

            {
                background = new ImageIcon(
                    getClass().getResource(
                        "/com/tarea_pokemon/src/Front/images/background/battle.png"
                    )
                ).getImage();

                enemy = new ImageIcon(
                    getClass().getResource(
                        "/com/tarea_pokemon/src/Front/images/sprites/substitute.png"
                    )
                ).getImage();
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Fondo
                g.drawImage(
                    background,
                    0, 0,
                    getWidth(), getHeight(),
                    this
                );

                // Pokémon actual
                g.drawImage(
                    imagenPokemonActual,
                    100, 149,
                    250, 250,
                    this
                );

                // Enemigo
                g.drawImage(
                    enemy,
                    600, 100,
                    300, 300,
                    this
                );
            }
        };

        panel.setLayout(null);

        JLabel nombre = new JLabel("Mewtwo");
        nombre.setForeground(Color.BLACK);
        nombre.setFont(new Font("Arial", Font.BOLD, 24));
        nombre.setBounds(70, 40, 200, 40);

        JLabel nivel = new JLabel("90");
        nivel.setForeground(Color.BLACK);
        nivel.setFont(new Font("Arial", Font.BOLD, 24));
        nivel.setBounds(285, 40, 200, 40);

        Pikachu pikachu = new Pikachu();

        JTextArea texto = new JTextArea();
        texto.setEditable(false);
        texto.setBounds(460, 425, 300, 105);

        JButton boton1 = new JButton("Placaje");
        boton1.setBounds(80, 425, 175, 50);

        JButton boton2 = new JButton("Impactrueno");
        boton2.setBounds(260, 425, 175, 50);

        JButton boton3 = new JButton("Puño Trueno");
        boton3.setBounds(80, 480, 175, 50);

        JButton boton4 = new JButton("-");
        boton4.setBounds(260, 480, 175, 50);

        JButton boton5 = new JButton("Cambiar Pokemon");
        boton5.setBounds(780, 450, 175, 50);

        // Acciones
        boton1.addActionListener(e -> {
            texto.setText(pikachu.atacarPlacaje());
        });

        boton2.addActionListener(e -> {
            texto.setText(pikachu.atacarImpactrueno());
        });

        boton3.addActionListener(e -> {
            texto.setText(pikachu.atacarPunioTrueno());
        });

        boton5.addActionListener(e -> {
            CambiarPokemonWindow selector =
                new CambiarPokemonWindow();

            selector.setVisible(true);
        });

        // Agregar al panel
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(texto);

        panel.add(nivel);
        panel.add(nombre);

        ventana.setContentPane(panel);
        ventana.setVisible(true);
    }


    // Cambiar Pokémon
    public static void cambiarPokemon(String nombre, String rutaImagen) {

        pokemonActual = nombre;

        imagenPokemonActual = new ImageIcon(
            MainWindow.class.getResource(rutaImagen)
        ).getImage();

        // Actualizar la pantalla
        panel.repaint();
    }
}
