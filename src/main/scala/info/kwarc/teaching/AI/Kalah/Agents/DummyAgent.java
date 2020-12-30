package info.kwarc.teaching.AI.Kalah.Agents;

import info.kwarc.teaching.AI.Kalah.Board;
import info.kwarc.teaching.AI.Kalah.util.Converter;
import java.util.ArrayList;
import java.util.List;

public class DummyAgent extends Agent  {
    String agentName;
    Converter GameInterface;
    List<String> participants;
    Board GameBoard;
    boolean isplayerone;

    public DummyAgent(){
        this.GameInterface = new Converter();
        this.participants = new ArrayList<>();
        this.participants.add("D1");
        this.participants.add("D2");
        this.participants.add("D3");
        this.agentName ="Dummy";
    }

    @Override
    public String name() {

        return this.agentName;
    }

    @Override
    public Iterable<String> students() {
        Iterable<String> iterable = participants;
        return iterable;
    }

    @Override
    public void init(Board board, boolean playerOne) {
        this.GameBoard = board;
        isplayerone = playerOne;

    }

    @Override
    public int move() {

        //Example for accessing the game via the converter class
        ArrayList<Integer> myhouses = this.GameInterface.getMyHouses(this.GameBoard, this.isplayerone);
        System.out.print("My houses are: ");
        for (int i: myhouses) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //Example for setting the TimeoutMove variable for the game
        this.GameInterface.setTimeoutMove(this,2);

        return 1;
    }


}
