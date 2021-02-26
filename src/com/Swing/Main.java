package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        // создаем окно и панель для него
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        // создаем кнопку и добавляем её на панель
        JButton jButton = new JButton("Нажми меня");
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setTitle(e.getSource().getClass().getName());
            }
        });

        // создаем кнопку и добавляем её на панель
        JButton jButton2 = new JButton("Нажми меня");
        jPanel.add(jButton2);

        //действие по нажатию
        jButton2.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};//наш класс, для запуска программы
        jFrame.setVisible(true);// делаем видимость
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// добавляем операцию для выхода
        Toolkit toolkit = Toolkit.getDefaultToolkit();// набор инструментов, с нашими JFrame
        Dimension dimension = toolkit.getScreenSize(); //возвращяет значения нашего экрана
        // размеры окна
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 -150, 500, 300);
        jFrame.setTitle("Hello");// надпись Title
        //jFrame.setIconImage(путь);
        return jFrame;
    }
}
