package pokergame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame1 {
    static String playersname[] = {"张三", "李四", "王五"};
    static String stages[] = {"大师一", "大师二", "大师三"};
    static ArrayList<Player> players = new ArrayList<>();
    static HashMap<Integer,String> hm=new HashMap<>();
    static ArrayList<Integer> list=new ArrayList<>();
    TreeSet<Integer> dipai=new TreeSet<>();
    TreeSet<Integer> player1=new TreeSet<>();
    TreeSet<Integer> player2=new TreeSet<>();
    TreeSet<Integer> player3=new TreeSet<>();
    static {
        for (int i = 0; i < playersname.length; i++) {
            Player player = new Player(playersname[i], stages[i]);
            players.add(player);
        }
        String []color={"♠","♥","♦","♣"};
        String []number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index=1;
        for(String c:number){
            for(String n:color){
                hm.put(index,c+n);
                list.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        list.add(index);
        hm.put(index+1,"大王");
        list.add(index+1);
//        System.out.println(hm);
//        System.out.println(list);
    }
    PokerGame1(){
        shuffle();
        deal();
        show(players.get(0),player1);
        show(players.get(1),player2);
        show(players.get(2),player3);
        System.out.print("底牌 ");
        for (Integer i : dipai) {
            System.out.print(hm.get(i)+" ");
        }
    }
    //洗牌
    public  void shuffle(){
        Collections.shuffle(list);
        //System.out.println(list);
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
    public  void show(Player player,TreeSet<Integer> ts){
        System.out.print(player.getName()+"--"+player.getStage()+" ");
        for(Integer i:ts){
            System.out.print(hm.get(i)+" ");
        }
        System.out.println();
    }
}

