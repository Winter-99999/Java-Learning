/*package ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(400,300);
        //设置界面的标题
        this.setTitle("拼图  登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        //设置窗口可见
        this.setVisible(true);

    }
}*/
package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LoginJFrame extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JButton registerButton;

    public LoginJFrame(){
        initFrame();
        initComponents();
        this.setVisible(true);
    }

    private void initFrame(){
        this.setSize(400,300);
        this.setTitle("拼图  登录");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    private void initComponents(){
        JLabel usernameLabel = new JLabel("用户名:");
        usernameLabel.setBounds(80, 50, 60, 30);
        this.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 30);
        this.add(usernameField);

        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(80, 100, 60, 30);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 30);
        this.add(passwordField);

        loginButton = new JButton("登录");
        loginButton.setBounds(100, 160, 80, 35);
        loginButton.addActionListener(this);
        this.add(loginButton);

        registerButton = new JButton("注册");
        registerButton.setBounds(220, 160, 80, 35);
        registerButton.addActionListener(this);
        this.add(registerButton);

        JLabel tipLabel = new JLabel("没有账号？请先注册");
        tipLabel.setBounds(130, 210, 150, 20);
        tipLabel.setForeground(Color.GRAY);
        this.add(tipLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            handleLogin();
        }else if(e.getSource() == registerButton){
            this.setVisible(false);
            new RegisterJFrame();
        }
    }

    private void handleLogin(){
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "用户名和密码不能为空", "提示", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Map<String, String> userMap = loadUsers();

        if(!userMap.containsKey(username)){
            JOptionPane.showMessageDialog(this, "用户名不存在", "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String storedPassword = userMap.get(username);
        if(storedPassword.equals(password)){
            JOptionPane.showMessageDialog(this, "登录成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new GameJFrame();
        }else{
            JOptionPane.showMessageDialog(this, "密码错误", "错误", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Map<String, String> loadUsers(){
        Map<String, String> userMap = new HashMap<>();
        File file = new File("users.txt");

        if(!file.exists()){
            return userMap;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length == 2){
                    userMap.put(parts[0], parts[1]);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        return userMap;
    }
}

