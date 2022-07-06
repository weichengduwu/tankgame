package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 李安福
 * @version 1.0
 */
public class DrawCircle extends JFrame{
    private MyPannel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("exit");
    }
    public DrawCircle(){
        mp = new MyPannel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPannel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //System.out.println("paint方法被调用");
        //g.drawOval(10,10,100,100);

//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,100,100);
//        g.setColor(Color.BLUE);
//        g.fillRect(10,10,100,100);
//        g.setColor(Color.red);
//        g.fillOval(100,100,100,100);
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/oak.jpeg"));
//        g.drawImage(image,10,10,this);
          g.setColor(Color.red);
          g.setFont(new Font("隶书",Font.BOLD, 50));
          g.drawString("北京你好",200,100);

    }
}