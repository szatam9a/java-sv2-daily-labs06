package day05;

public class ProductAndPieces {
    private  Type type;
    private int count =1;

    public ProductAndPieces(Type type) {
        this.type = type;
    }

    public void gotAPiece(){
        count++;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
