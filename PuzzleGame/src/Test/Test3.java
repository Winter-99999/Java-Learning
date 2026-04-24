package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setSize(400,300);
        //设置界面的标题
        jFrame.setTitle("test3");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置界面关闭模式
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(null);


        //创建一个按钮对象
        JButton jtb=new JButton("按钮");
        //设置按钮的位置和宽高
        jtb.setBounds(0,0,100,50);
        //匿名内部类实现ActionListener接口
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了按钮");
            }
        });
        jFrame.getContentPane().add(jtb);
        //设置窗口可见
        jFrame.setVisible(true);
    }
}
