
/*
import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public  RegisterJFrame(){
        this.setSize(488,500);
        //设置界面的标题
        this.setTitle("拼图  注册");
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

        public class RegisterJFrame extends JFrame implements ActionListener {
            JTextField usernameField;
            JPasswordField passwordField;
            JPasswordField confirmPasswordField;
            JButton registerButton;
            JButton backButton;

            public RegisterJFrame(){
                initFrame();
                initComponents();
                this.setVisible(true);
            }

            private void initFrame(){
                this.setSize(488,500);
                this.setTitle("拼图  注册");
                this.setAlwaysOnTop(true);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(3);
                this.setLayout(null);
            }

            private void initComponents(){
                JLabel titleLabel = new JLabel("用户注册");
                titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
                titleLabel.setBounds(180, 30, 120, 40);
                this.add(titleLabel);

                JLabel usernameLabel = new JLabel("用户名:");
                usernameLabel.setBounds(100, 100, 70, 30);
                this.add(usernameLabel);

                usernameField = new JTextField();
                usernameField.setBounds(180, 100, 200, 30);
                this.add(usernameField);

                JLabel passwordLabel = new JLabel("密码:");
                passwordLabel.setBounds(100, 160, 70, 30);
                this.add(passwordLabel);

                passwordField = new JPasswordField();
                passwordField.setBounds(180, 160, 200, 30);
                this.add(passwordField);

                JLabel confirmPasswordLabel = new JLabel("确认密码:");
                confirmPasswordLabel.setBounds(100, 220, 70, 30);
                this.add(confirmPasswordLabel);

                confirmPasswordField = new JPasswordField();
                confirmPasswordField.setBounds(180, 220, 200, 30);
                this.add(confirmPasswordField);

                registerButton = new JButton("注册");
                registerButton.setBounds(130, 300, 90, 40);
                registerButton.addActionListener(this);
                this.add(registerButton);

                backButton = new JButton("返回");
                backButton.setBounds(260, 300, 90, 40);
                backButton.addActionListener(this);
                this.add(backButton);

                JLabel tipLabel = new JLabel("* 用户名不能重复，密码至少6位");
                tipLabel.setBounds(120, 370, 250, 20);
                tipLabel.setForeground(Color.RED);
                tipLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
                this.add(tipLabel);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == registerButton){
                    handleRegister();
                }else if(e.getSource() == backButton){
                    this.setVisible(false);
                    new LoginJFrame();
                }
            }

            private void handleRegister(){
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();
                String confirmPassword = new String(confirmPasswordField.getPassword()).trim();

                if(username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
                    JOptionPane.showMessageDialog(this, "所有字段都不能为空", "提示", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if(username.length() < 3){
                    JOptionPane.showMessageDialog(this, "用户名至少3个字符", "提示", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if(password.length() < 6){
                    JOptionPane.showMessageDialog(this, "密码至少6个字符", "提示", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if(!password.equals(confirmPassword)){
                    JOptionPane.showMessageDialog(this, "两次输入的密码不一致", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Map<String, String> userMap = loadUsers();

                if(userMap.containsKey(username)){
                    JOptionPane.showMessageDialog(this, "用户名已存在，请更换", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                userMap.put(username, password);
                saveUsers(userMap);

                JOptionPane.showMessageDialog(this, "注册成功！请登录", "成功", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                new LoginJFrame();
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

            private void saveUsers(Map<String, String> userMap){
                try(PrintWriter writer = new PrintWriter(new FileWriter("users.txt"))){
                    for(Map.Entry<String, String> entry : userMap.entrySet()){
                        writer.println(entry.getKey() + "," + entry.getValue());
                    }
                }catch(IOException e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "保存用户信息失败", "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


