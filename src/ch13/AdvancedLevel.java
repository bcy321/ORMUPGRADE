package ch13;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프를 할 수 있습니다.");
        System.out.println("점프를 할 수 있습니다.");
    }

    @Override
    public void turn() {
        System.out.println("돌기를 할 수 없습니다.");
    }

    @Override
    public void showLevel() {
        System.out.println("중급자 레벨 입니다.");
    }
}
