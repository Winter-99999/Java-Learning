package Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyJframe3 extends JFrame implements KeyListener {
    JButton jtb1 = new JButton("按钮1");
    JButton jtb2 = new JButton("按钮2");

    public MyJframe3() {
        this.setSize(400, 400);
        //设置界面的标题
        this.setTitle("MouseListener");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        this.setLayout(null);

        //添加键盘监听
        this.addKeyListener(this);

        this.setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    //如果没松，会反复调用
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        //获取按键编号
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);
    }
}
