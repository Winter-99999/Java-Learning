package ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int [][]arr=new int[3][3];
    int x=0;
    int y=0;
    int win[][]=new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    int step=0;
    //创建子选项
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    public GameJFrame() {
        //初始化界面
        initJFrame();
        //初始化菜单栏
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage();
        //添加键盘监听
        this.addKeyListener(this);
        //设置窗口可见
        this.setVisible(true);
    }
    //初始化数据
  /*  private void initData() {
        Random random=new Random();
        int[] array={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i++) {
            int n=random.nextInt(9);
            int temp=array[i];
            array[i]=array[n];
            array[n]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]==1){
                x=i/3;
                y=i%3;
                System.out.println(x+"  "+y);
                arr[x][y]=0;
            }
            arr[i/3][i%3]=array[i];
        }
    }*/
    private void initData() {
        // 初始为目标状态
        int[][] target = {
                {1,2,3},
                {4,5,6},
                {7,8,9} // 1 代表空白
        };

        // 复制到 arr
        for (int i = 0; i < 3; i++) {
            System.arraycopy(target[i], 0, arr[i], 0, 3);
        }

        // 记录空白位置
        int blankX = 0, blankY = 0;

        Random random = new Random();
        // 随机滑动 100~200 次（次数越多越乱）
        int steps = 100 + random.nextInt(101);

        int[] dx = {-1, 1, 0, 0};  // 上、下、左、右
        int[] dy = {0, 0, -1, 1};

        for (int step = 0; step < steps; step++) {
            // 随机选择一个方向
            int dir = random.nextInt(4);
            int newX = blankX + dx[dir];
            int newY = blankY + dy[dir];

            // 检查是否在边界内
            if (newX >= 0 && newX < 3 && newY >= 0 && newY < 3) {
                // 交换空白（1）和相邻方块
                arr[blankX][blankY] = arr[newX][newY];
                arr[newX][newY] = 1;   // ✅ 空白位置放 1
                blankX = newX;
                blankY = newY;
            }
            // 如果出界，什么都不做，继续下一次循环
        }
        x=blankX;
        y=blankY;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // 打印空白位置
        System.out.println(blankX + "  " + blankY);
    }

    //初始化图片
    private void initImage() {
        //清空界面
        this.getContentPane().removeAll();
        if(victory()){
            JLabel winJlabel=new JLabel(new ImageIcon("E:\\idea\\projects\\code\\PuzzleGame\\ph\\R-C.png"));
            winJlabel.setBounds(130,130,315,315);
            this.getContentPane().add(winJlabel);
        }
        //刷新界面
        this.repaint();

        JLabel stepCount=new JLabel("步数："+step);
        this.getContentPane().add(stepCount);
        stepCount.setBounds(50,30,100,80);

        //先加载的图片在上方，后加载的图片在下方

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int count = arr[i][j];
                //创建一个JLable的对象（管理容器）
                JLabel label = new JLabel(new ImageIcon("E:\\idea\\projects\\code\\PuzzleGame\\ph\\" + count + ".jpg"));
                // 设置图片位置
                label.setBounds(105 * j+130, 105 * i+130, 105, 105);
                //给图片设置边框
                label.setBorder(new BevelBorder(1));
                //把管理容器添加到界面中
                this.getContentPane().add(label);
            }
        }

        //添加背景图片
        JLabel background=new JLabel(new ImageIcon("ph\\11.jpg"));   //相对路径，从项目的根目录下找
        background.setBounds(50,50,500,520);
        this.getContentPane().add(background);
        this.getContentPane().repaint();


//        //创建一个图片
//        ImageIcon icon=new ImageIcon("E:\\idea\\projects\\code\\PuzzleGame\\ph\\.jpg");
//        //创建一个JLable的对象（管理容器）
//        JLabel label=new JLabel(icon);
//        //设置图片位置
//        label.setBounds(0,0,105,105);
//        //把管理容器添加到界面中
//        //this.add(label);
//        this.getContentPane().add(label);
    }

    private void initJMenuBar() {
        //创建一个菜单栏
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的选项
        JMenu functionjMenu = new JMenu("功能");
        JMenu aboutjMenu = new JMenu("关于我们");



        //将子选项添加到对应的选项中
        functionjMenu.add(replayItem);
        functionjMenu.add(reLoginItem);
        functionjMenu.add(closeItem);
        aboutjMenu.add(accountItem);
        //给子选项绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        //将选项添加到菜单栏中
        jMenuBar.add(functionjMenu);
        jMenuBar.add(aboutjMenu);
        //将菜单栏添加到界面中
        this.setJMenuBar(jMenuBar);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图游戏 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        //加载完整图片
        if(code==65){
            this.getContentPane().removeAll();
            JLabel all=new JLabel(new ImageIcon("ph\\13.jpg"));
            all.setBounds(130,130,315,315);
            this.getContentPane().add(all);
        }
        //添加背景图片
        JLabel background=new JLabel(new ImageIcon("ph\\11.jpg"));   //相对路径，从项目的根目录下找
        background.setBounds(50,50,500,520);
        this.getContentPane().add(background);
        //刷新界面
        this.getContentPane().repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
         //左37 上38 右39 下40
         //向左移是把图片1右边的图片移到左边
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case 37: {
                if(y==2){
                    return;
                }
                arr[x][y]=arr[x][y+1];
                arr[x][y+1]=1;
                y++;
                step++;
                initImage();
                break;
            }

            case 38:{
                if(x==2){
                    return;
                }

                arr[x][y]=arr[x+1][y];
                arr[x+1][y]=1;
                x++;
                step++;
                initImage();
                break;
            }

            case 39: {
                if(y==0){
                    return;
                }
                arr[x][y] = arr[x][y - 1];
                arr[x][y - 1] = 1;
                y--;
                step++;
                initImage();
                break;
            }
            case 40:{
                if(x==0){
                    return;
                }
                arr[x][y]=arr[x-1][y];
                arr[x-1][y]=1;
                x--;
                step++;
                initImage();
                break;
            }
        }
        if(keyCode==65){
            initImage();
        }else if(keyCode==87){
            this.getContentPane().removeAll();
            arr=new int[][]{
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            initImage();
        }
    }

    public boolean victory(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return  true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==replayItem){
            this.getContentPane().removeAll();
            //重新初始化数据
            step=0;
            initData();
            initImage();
        }else if(obj==reLoginItem){
            //关闭当前界面
            this.setVisible(false);
            //创建登录界面
            new LoginJFrame();
        }else if(obj==closeItem){
            System.exit(0);
        }else if(obj==accountItem){
            JDialog j=new JDialog();
            JLabel jl=new JLabel(new ImageIcon("E:\\idea\\projects\\code\\PuzzleGame\\ph\\13.jpg"));
            jl.setBounds(0,0,315,300);
            j.getContentPane().add(jl);
            j.setSize(315,300);
            j.setAlwaysOnTop(true);
            j.setLocationRelativeTo(null);
            //弹窗不关闭无法执行其他操作
            j.setModal(true);
            j.setVisible(true);
        }
    }
}

