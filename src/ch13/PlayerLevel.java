package ch13;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevel();

    final public void go(int level){
//        showLevel();
        run();
        jump();
        turn();
    }



}
