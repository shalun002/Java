package com.myCompany.Catch_the_drop;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class GameWindow extends JFrame {

    private static GameWindow game_window;
    private static long last_frame_time;
    private static Image background;
    private static Image game_over;
    private static Image drop;
    private static int score;


    private static float drop_v = 100;
    private static float drop_Left = 200;
    private static float drop_Top = -100;


    public static void main(String[] args) throws IOException {

        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));

        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    // для закрытия программы, если нажать на крестик
        game_window.setLocation(200, 100);   // положение окна
        game_window.setSize(906, 478);      // размер окна
        game_window.setResizable(false);  // размер окна не изменяется

        last_frame_time = System.nanoTime();

        final GameField game_field = new GameField();
        game_field.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                float drop_right = drop_Left + drop.getHeight(null);
                float drop_buttom = drop_Top + drop.getHeight(null);

                boolean is_drop = x >= drop_Left && x <= drop_right && y >= drop_Top && y <= drop_buttom;

                if (is_drop){
                    drop_Top = -100;
                    drop_Left = (int)(Math.random() * (game_field.getWidth() - drop.getWidth(null)));
                    drop_v = drop_v + 20;
                    score++;
                    game_window.setTitle("Score " + score);
                }

            }
        });
        game_window.add(game_field);

        game_window.setVisible(true);    // делает окно видимым
    }

    private static void OnRepaint(Graphics g){

        long current_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time) * 0.000000001f;
        last_frame_time = current_time;


        drop_Top = drop_Top + drop_v * delta_time;
        g.drawImage(background, 0,0, null);   // координаты х и у
        g.drawImage(drop, (int)drop_Left, (int)drop_Top, null);
        if (drop_Top > game_window.getHeight())g.drawImage(game_over, 280, 120, null);  // вывод game over

        //g.fillOval( 100, 20, 150, 150);     // круг
        //g.drawLine(450, 300, 200, 300);         // линия
    }

    private static class GameField extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponents(g);
            OnRepaint(g);
            repaint();
        }
    }
}
