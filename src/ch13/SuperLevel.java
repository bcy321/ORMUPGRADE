package ch13;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 점프를 합니다.");
        System.out.println("아주 높이 점프를 합니다.");
        System.out.println("아주 높이 점프를 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("돌기를 합니다.");
    }

    @Override
    public void showLevel() {
        System.out.println("고급자 레벨 입니다.");
    }
}
