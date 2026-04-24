package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJframe extends JFrame implements ActionListener {
    JButton jtb1=new JButton("按钮1");
    JButton jtb2=new JButton("按钮2");
    public MyJframe() {
        this.setSize(400,400);
        //设置界面的标题
        this.setTitle("ActionListener");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        this.setLayout(null);


        jtb1.setBounds(0,0,100,50);
        jtb1.addActionListener(this);


        jtb2.setBounds(100,0,100,50);
        jtb2.addActionListener(this);

        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jtb1){
            System.out.println("点击了按钮1");
            jtb1.setSize(100,100);
        }else if (e.getSource()==jtb2){
            System.out.println("点击了按钮2");
            Random r=new Random();
            jtb2.setLocation(r.nextInt(300),r.nextInt(300));
        }
    }
}
