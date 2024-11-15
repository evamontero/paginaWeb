/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacionconpestanas;

/**
 *
 * @author 2024-2025 DAM1
 */

import javax.swing.*;

public class AplicacionConPestanas {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame ventanaPrincipal = new JFrame("Ventana Principal");
        ventanaPrincipal.setSize(400, 300);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Crear el panel de pestañas (JTabbedPane)
        JTabbedPane panelDePestanas = new JTabbedPane();

        // Crear una pestaña inicial
        JPanel panelInicial = new JPanel();
        panelInicial.add(new JLabel("Esta es la primera pestaña en la ventana principal."));
        panelDePestanas.addTab("Pestaña 1", panelInicial);

        // Botón para abrir otra ventana con más pestañas
        JButton botonAbrirNuevaVentana = new JButton("Abrir nueva ventana");
        botonAbrirNuevaVentana.addActionListener(e -> abrirVentanaConPestanas());

        // Añadir el botón a la ventana principal
        ventanaPrincipal.add(panelDePestanas);
        ventanaPrincipal.add(botonAbrirNuevaVentana, "South");

        // Hacer visible la ventana principal
        ventanaPrincipal.setVisible(true);
    }

    // Método para abrir una nueva ventana con pestañas
    private static void abrirVentanaConPestanas() {
        JFrame nuevaVentana = new JFrame("Nueva Ventana");
        nuevaVentana.setSize(300, 200);
        nuevaVentana.setLocationRelativeTo(null);

        // Crear otro panel de pestañas para la nueva ventana
        JTabbedPane panelDePestanasNueva = new JTabbedPane();

        // Crear las pestañas en la nueva ventana
        JPanel nuevaPestana1 = new JPanel();
        nuevaPestana1.add(new JLabel("Esta es una pestaña en la nueva ventana."));
        panelDePestanasNueva.addTab("Nueva Pestaña 1", nuevaPestana1);

        JPanel nuevaPestana2 = new JPanel();
        nuevaPestana2.add(new JLabel("Esta es otra pestaña en la nueva ventana."));
        panelDePestanasNueva.addTab("Nueva Pestaña 2", nuevaPestana2);

        // Añadir el panel de pestañas a la nueva ventana
        nuevaVentana.add(panelDePestanasNueva);

        // Hacer visible la nueva ventana
        nuevaVentana.setVisible(true);
    }
}

