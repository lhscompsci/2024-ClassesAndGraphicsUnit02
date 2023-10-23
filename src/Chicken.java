public class Chicken {
    //instance variables
    private int size;
    private boolean fly;

    //constructor -- NOT METHODS
    public Chicken(int s, boolean c){
        size = s;
        fly = c;
    }

    //mutator methods
    public void setFly(boolean f){
        fly = f;
    }
    public void setSize(int s){
        size = s;
    }

    //accessor methods
    public int getSize(){
        return size;
    }
    public boolean getFly(){
        return fly;
    }
}
