package exam;

public class SinRamen extends Ramen {

    @Override
    public void putWater() {
        System.out.println("신라면은 물 500ml를 넣는다.");
    }

    @Override
    public void putSoup() {
        System.out.println("스프를 넣는다.");
    }

    @Override
    public void waitTime() {
        System.out.println("3분 후 완료!\n");
    }
}
