//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
//        System.out.println(list);
//        list.add(1, 10);
//        System.out.println(list);
//        list.remove(Integer.valueOf(10));
//        System.out.println(list);
//         list.clear();
//        System.out.println(list);
//        //O(N) -> time

        // set O(1)
//        list.set(0,900);
//        System.out.println(list);
//
//       System.out.println(list.get(0));

        Queue<Integer> pq = new LinkedList<>();
        pq.offer(2);
        pq.offer(3);

        Set<Integer> set = new HashSet<>(); // only uniuq O(1)
        Set<Integer> set1 = new LinkedHashSet<>() ;//only order or sorted order
        Set<Integer> set2 = new TreeSet<>(); //above both nin one
        set.add(32);
        //random order but unique
        set.add(2);
        System.out.println(set);
        Map<String , Integer> mp = new HashMap<>(); // other TreeMap -> just in sorted
        mp.put("first", 1);
        mp.put("sec",2);

        for(String key: mp.keySet()){
            System.out.println(key);
        }


        /*

        tic tae toe ->
        timed game ?
        undo moves allowed
        spected?
        statistic for user , x play gemaes and rand 1
        tourmnt
        ai?
        rating feature
        state
        each square ->  obj  echa square have player  taking as square as int state
        winner  -1 , 2 , droq undeceide

        method -?
        bejavior
        initialise 2 d
        2 getter method
        getcurplayer  flip(0,1)-> switch btn player
        makemore(move obj) ->  who is making move with which cell
        row col -> int player
        2 d matic


        user -> user id , static - > winner , losses , opponent

        game
        gameid
        two user id
        list of moves

        intialise()
        in order 1 time in order to move time and getting winner
        u need to makaea move in order one time ?
        who the winner is in order 1 time
        getting winnwer -> n2
        making move is when actually winner it is






        wineer is decide whn u making x , and it has to be part of winning part
        a win always use the last move
        only x can win after their moves , there fore checking diaglon , row and col making touching at point of wining state . as reducting as O(1)  just checking thr current row col and diagn
        how (1) just wining move , this make winner as order 1 time as prcompute the score in row means ig it reach n anyime he wins
         */
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}