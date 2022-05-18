public class Swim extends Obstacle {
    private int dist;

    public Swim(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(dist);
    }
}