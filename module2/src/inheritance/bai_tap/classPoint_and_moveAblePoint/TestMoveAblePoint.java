package inheritance.bai_tap.classPoint_and_moveAblePoint;

public class TestMoveAblePoint {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint();

        moveAblePoint.setXY(1,2);
        moveAblePoint.setSpeed(3,4);
        System.out.println(moveAblePoint.toString());
        System.out.println(moveAblePoint.move());
    }
}
