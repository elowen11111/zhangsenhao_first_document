package Exercise.Game;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册相关
    public RegisterJFrame(){
        this.setSize(488,500);
        this.setTitle("拼图登录");
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
