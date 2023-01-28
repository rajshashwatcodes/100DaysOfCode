public class InterfaceKeyword {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

// creating ChessPlayer interface

interface ChessPlayer {
    void moves(); //no implemenetation can be written in the interface 
}

class Queen implements ChessPlayer { //Queen class is implementing the ChessPlayer interface
    // if public keyword is not written the method will become default which is inacceptable
    public void moves() { //recreating "move" function with implementation
        System.out.println("up , down , left , right , diagonal (in all four directions by 1 step)");
    }
}

class Rook implements ChessPlayer { //Rook class is implementing the ChessPlayer interface
    // if public keyword is not written the method will become default which is inacceptable
    public void moves() { //recreating "move" function with implementation
        System.out.println("up , down , left , right , diagonal (in all four directions)");
    }
}

class King implements ChessPlayer { //King class is implementing the ChessPlayer interface
    // if public keyword is not written the method will become default which is inacceptable
    public void moves() { //recreating "move" function with implementation
        System.out.println("up , down , left , right , diagonal (in all four directions by 1 step)");
    }
}
