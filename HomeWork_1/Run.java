public class Run extends Obstacle {
    private int dist;

    public Run(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}