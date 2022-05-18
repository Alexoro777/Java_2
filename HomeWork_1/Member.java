public class Member implements Competitor {
    protected String name;
    protected int power;
    protected boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Member(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void run(int dist) {
        if (dist <= power) {
            System.out.println(name + " Пробежал дистанцию");
        } else {
            System.out.println(name + " Не пробежал");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= power) {
            System.out.println(name + " Выполнил прыжок");
        } else {
            System.out.println(name + " Не прыгнул");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= power) {
            System.out.println(name + " Проплыл дистанцию");
        } else {
            System.out.println(name + " Не проплыл");
            active = false;
        }
    }

    @Override
    public void result() {
        System.out.println(name + ": " + active);
    }
}