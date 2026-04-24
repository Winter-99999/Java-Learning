package Test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJframe2 extends JFrame implements MouseListener {
    JButton jtb1=new JButton("按钮1");
    JButton jtb2=new JButton("按钮2");
    public MyJframe2() {
        this.setSize(400,400);
        //设置界面的标题
        this.setTitle("MouseListener");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        this.setLayout(null);


        jtb1.setBounds(0,0,100,50);
        jtb1.addMouseListener(this);


        jtb2.setBounds(100,0,100,50);
        jtb2.addMouseListener(this);

        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);

        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击鼠标");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下鼠标不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开鼠标");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标划出");
    }
}
