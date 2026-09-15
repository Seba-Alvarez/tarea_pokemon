package com.tarea_pokemon.src.Front;

import javax.swing.*;

import com.tarea_pokemon.src.Logica.Pikachu;
import com.tarea_pokemon.src.Logica.Bulbasaur;
import com.tarea_pokemon.src.Logica.Charmander;
import com.tarea_pokemon.src.Logica.Squirtle;
import com.tarea_pokemon.src.Logica.Pokemon;

import java.awt.*;

public class MainWindow {

    static String pokemonActual = "Pikachu";
    static Image imagenPokemonActual;

    static JPanel panel;

    static JButton boton1;
    static JButton boton2;
    static JButton boton3;
    static JButton boton4;

    static Pokemon pokemon;

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Mi ventana");

        ventana.setSize(1000, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imagenPokemonActual = new ImageIcon(
            MainWindow.class.getResource(
                "/com/tarea_pokemon/src/Front/images/sprites/pikachu.png"
            )
        ).getImage();

        pokemon = new Pikachu();

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

                g.drawImage(
                    background,
                    0, 0,
                    getWidth(), getHeight(),
                    this
                );

                g.drawImage(
                    imagenPokemonActual,
                    100, 149,
                    250, 250,
                    this
                );

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

        JTextArea texto = new JTextArea();
        texto.setEditable(false);
        texto.setBounds(460, 425, 300, 105);

        boton1 = new JButton("Placaje");
        boton1.setBounds(80, 425, 175, 50);

        boton2 = new JButton("Impactrueno");
        boton2.setBounds(260, 425, 175, 50);

        boton3 = new JButton("Puño Trueno");
        boton3.setBounds(80, 480, 175, 50);

        boton4 = new JButton("-");
        boton4.setBounds(260, 480, 175, 50);

        JButton boton5 = new JButton("Cambiar Pokemon");
        boton5.setBounds(780, 450, 175, 50);

        boton1.addActionListener(e -> {

            if (pokemonActual.equals("Pikachu")) {
                texto.setText(((Pikachu) pokemon).atacarPlacaje());

            } else if (pokemonActual.equals("Bulbasaur")) {
                texto.setText(((Bulbasaur) pokemon).atacarPlacaje());

            } else if (pokemonActual.equals("Charmander")) {
                texto.setText(((Charmander) pokemon).atacarAraniazo());

            } else if (pokemonActual.equals("Squirtle")) {
                texto.setText(((Squirtle) pokemon).atacarMordisco());
            }
        });

        boton2.addActionListener(e -> {

            if (pokemonActual.equals("Pikachu")) {
                texto.setText(((Pikachu) pokemon).atacarImpactrueno());

            } else if (pokemonActual.equals("Bulbasaur")) {
                texto.setText(((Bulbasaur) pokemon).atacarDrenaje());

            } else if (pokemonActual.equals("Charmander")) {
                texto.setText(((Charmander) pokemon).atacarAscuas());

            } else if (pokemonActual.equals("Squirtle")) {
                texto.setText(((Squirtle) pokemon).atacarBurbuja());
            }
        });

        boton3.addActionListener(e -> {

            if (pokemonActual.equals("Pikachu")) {
                texto.setText(((Pikachu) pokemon).atacarPunioTrueno());

            } else if (pokemonActual.equals("Bulbasaur")) {

            } else if (pokemonActual.equals("Charmander")) {
                texto.setText(((Charmander) pokemon).atacarMordisco());

            } else if (pokemonActual.equals("Squirtle")) {
                texto.setText(((Squirtle) pokemon).atacarHidrobomba());
            }
        });

        boton4.addActionListener(e -> {

            if (pokemonActual.equals("Pikachu")) {

            } else if (pokemonActual.equals("Bulbasaur")) {

            } else if (pokemonActual.equals("Charmander")) {
                texto.setText(((Charmander) pokemon).atacarLanzallamas());

            } else if (pokemonActual.equals("Squirtle")) {
                texto.setText(((Squirtle) pokemon).atacarPlacaje());
            }
        });

        boton5.addActionListener(e -> {

            CambiarPokemonWindow selector =
                new CambiarPokemonWindow();

            selector.setVisible(true);
        });

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

    public static void cambiarPokemon(String nombre, String rutaImagen) {

        pokemonActual = nombre;

        imagenPokemonActual = new ImageIcon(
            MainWindow.class.getResource(rutaImagen)
        ).getImage();

        if (nombre.equals("Pikachu")) {
            pokemon = new Pikachu();

        } else if (nombre.equals("Bulbasaur")) {
            pokemon = new Bulbasaur();

        } else if (nombre.equals("Charmander")) {
            pokemon = new Charmander();

        } else if (nombre.equals("Squirtle")) {
            pokemon = new Squirtle();
        }

        if (nombre.equals("Pikachu")) {

            boton1.setText("Placaje");
            boton2.setText("Impactrueno");
            boton3.setText("Puño Trueno");
            boton4.setText("-");

        } else if (nombre.equals("Squirtle")) {

            boton1.setText("Mordisco");
            boton2.setText("Burbuja");
            boton3.setText("Hidrobomba");
            boton4.setText("Placaje");

        } else if (nombre.equals("Charmander")) {

            boton1.setText("Arañazo");
            boton2.setText("Ascuas");
            boton3.setText("Mordisco");
            boton4.setText("Lanzallamas");

        } else if (nombre.equals("Bulbasaur")) {

            boton1.setText("Placaje");
            boton2.setText("Drenaje");
            boton3.setText("-");
            boton4.setText("-");
        }

        panel.repaint();
    }
}