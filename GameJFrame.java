package Exercise.Game;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化图片
        initImage();

        //禁止用户调整窗口大小
        this.setResizable(false);

        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }

    private void initImage() {
        //创建一个图片ImageIcon的对象
        ImageIcon icon =new ImageIcon("D:\\javadevelopment\\javadaima\\HeiMa\\src\\Exercise\\Game\\image\\素材\\image\\animal\\animal3\\3.jpg");

        //创建一个JLabel对象（管理容器）
        JLabel jLabel =new JLabel(icon);
        //把管理容器添加到界面中
        this.add(jLabel);
    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar=new JMenuBar();

        //创建菜单上面的两个选项的对象（功能  关于我们）
        JMenu functionJMenu =new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem =new JMenuItem("重新游戏");
        JMenuItem reloginItem =new JMenuItem("重新登录");
        JMenuItem closeItem =new JMenuItem("关闭游戏");

        JMenuItem accountItem =new JMenuItem("公众号");

        //将每一个选项下面的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(3);
    }
}
