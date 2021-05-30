package exam;



public class Ansungtangmen extends Ramen {

    @Override
    public void putWater() {
        System.out.println("안성탕면은 물 550ml를 넣는다.");
    }

    @Override
    public void putSoup() {
        System.out.println("스프를 넣는다.");
    }

    @Override
    public void waitTime() {
        System.out.println("4분 후 완료!\n");
    }

}