package Exercise.Game;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //表示登陆页面

    public LoginJFrame(){
        this.setSize(488,430);
        this.setTitle("拼图注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(3);
        //禁止用户调整窗口大小
        this.setResizable(false);
        this.setVisible(true);
    }
}
