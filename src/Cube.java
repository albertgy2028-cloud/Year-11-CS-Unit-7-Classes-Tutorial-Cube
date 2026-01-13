public class Cube {
    private int side;

    public int getSide(){
        return side;
    }
    public void setSide(int side){
        checkPositive(side);
        this.side=side;
    }
    public void checkPositive(int side){
        if(side<=0){
            throw new IllegalArgumentException("Side length must be positive.");
        }
    }
    
    public Cube(int side){
        checkPositive(side);
        this.side=side;
    }
    
    public Cube () {
        side = 1;
    }

    public int calculateVolume () {
        return side*side*side;
    }
    
    public int calculateSurfaceArea () {
        return side*side*6;
    }

}
