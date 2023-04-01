package package2;

import java.util.Stack;

public class Access3 {
    public static void main(String[] args) {

        Stack<String> games = new Stack<String>();
        games.add("Call of Duty");
        games.add("Guitar Hero");
        games.add("Super Monkey Ball");

        System.out.println(games.peek());
        System.out.println(games.pop());
        System.out.println(games.empty());
        System.out.println(games.contains("Horizon"));
        System.out.println(games.get(1));
        System.out.println(games);



    }
}
