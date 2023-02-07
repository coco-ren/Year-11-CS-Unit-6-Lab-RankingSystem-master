import static org.junit.jupiter.api.Assertions.assertEquals;

public class User  {

    private int rank;
    private int progress;

    public User() {
        rank = -8;
        progress = 0;
    }

    public int getRank() {
        return rank;
    }

    public int getProgress() {
        return progress;
    }

    public void incProgress(int activityRank)  {
        if (activityRank == 0 || activityRank > 8 || activityRank < -8)  throw new IllegalArgumentException(
                "The rank of an activity cannot be less than 8, 0, or greater than 8!");

            if (rank > activityRank) {
                progress += 1;
            } else if (rank == activityRank) {
                progress +=3;
            } else if (rank < activityRank) {
                if (activityRank > 0 && rank < 0) {
                    progress += 10 * (activityRank - rank - 1) * (activityRank - rank - 1);
            } else {
                    progress += 10 * (activityRank - rank) * (activityRank - rank);
                }

            }

        while (progress >= 100) {
            if (rank == -1) {
                rank = 1;
            } else {
                rank+=1;
            }
            progress -= 100;
        }



        }



    public String toString() {
        return "User{" +
                "rank=" + rank +
                ", progress=" + progress +
                '}';
    }
}


