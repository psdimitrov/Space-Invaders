package com.company.graphics;

import com.company.game.AbstractObjects.GameObject;

import javax.swing.*;
import java.awt.*;

public class Display {

    private int width;
    private int height;
    private String title;

    private Canvas canvas;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        initDisplay();
    }

    private void initDisplay(){
        JFrame frame = new JFrame(this.title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setFocusable(true);

        this.canvas = new Canvas();
        this.canvas.setSize(this.width, this.height);
        this.canvas.setMaximumSize(new Dimension(width, height));
        this.canvas.setMinimumSize(new Dimension(width, height));

        frame.add(this.canvas);

        frame.pack();
    }

    public Canvas getCanvas(){
        return this.canvas;
    }

}
