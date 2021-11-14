package cursorslist;

public class Position {
    private int x;
    public Position(int number){
        x = number;
    }

    public int getX() {
        return x;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position Data = (Position) o;
        return (this.x == Data.x);
    }

}
