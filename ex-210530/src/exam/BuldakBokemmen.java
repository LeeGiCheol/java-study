package exam;

public class BuldakBokemmen extends Ramen {

    @Override
    public void putWater() {
        System.out.println("불닭볶음면은 물 600ml를 넣는다.");
    }

    public void pourWater() {
        System.out.println("물을 버린다.");
    }

    @Override
    public void putSoup() {
        System.out.println("스프를 넣는다.");
    }

    @Override
    public void waitTime() {
        System.out.println("5분 후 완료!\n");
    }

}