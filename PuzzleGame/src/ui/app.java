package ui;

import javax.swing.*;

public class app {
    //启动入口
    public static void main(String[] args) {
       /*new LoginJFrame();
       new RegisterJFrame();
        new GameJFrame();*/

        SwingUtilities.invokeLater(() -> {
            new LoginJFrame();
        });
    }
}
