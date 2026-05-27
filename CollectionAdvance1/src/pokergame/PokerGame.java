package pokergame;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    static ArrayList<String> list=new ArrayList<>();
    ArrayList<String> player1=new ArrayList<>();
    ArrayList<String> player2=new ArrayList<>();
    ArrayList<String> player3=new ArrayList<>();
    ArrayList<String> dipai=new ArrayList<>();
    static String playersname[] = {"张三", "李四", "王五"};
    static String stages[] = {"大师一", "大师二", "大师三"};
    static ArrayList<Player> players = new ArrayList<>();
    //静态代码块
    //只执行一次
    static {
        for (int i = 0; i < playersname.length; i++) {
            Player player = new Player(playersname[i], stages[i]);
            players.add(player);
        }
        String []color={"♠","♥","♦","♣"};
        String []number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(String c:color){
            for(String n:number){
                list.add(c+n);
            }
        }
        list.add("小王");
        list.add("大王");
        System.out.println(list);
    }
    PokerGame(){
        shuffle();
        deal();
        show(players.get(0),player1);
        show(players.get(1),player2);
        show(players.get(2),player3);
        for (int i = 0; i < dipai.size(); i++) {
            if(i==0){
                System.out.print("底牌 ");
                System.out.print(dipai.get(i)+" ");
            }else{
                System.out.print(dipai.get(i)+" ");
            }
        }
    }
    //洗牌
    public  void shuffle(){
        Collections.shuffle(list);
        System.out.println(list);
    }
    //发牌
    public  void deal(){
        for (int i = 0; i < list.size(); i++) {
            if(i>=51){
                dipai.add(list.get(i));
            }else if(i%3==0){
                player1.add(list.get(i));
            }else if(i%3==1){
                player2.add(list.get(i));
            }else if(i%3==2){
                player3.add(list.get(i));
            }
        }
    }
    //看牌
    public  void show(Player player,ArrayList<String> list){
        System.out.print(player.getName()+"--"+player.getStage()+" ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
