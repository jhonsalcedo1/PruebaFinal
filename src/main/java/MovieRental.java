
public class MovieRental {
    private String movieId;
    private int days;

    public MovieRental(String movieId, int days) {
        this.movieId = movieId;
        this.days = days;
    }

    public String getMovieId() {
        return movieId;
    }
    @Override
public String toString() {
    return "MovieRental[movieId=" + movieId + ", days=" + days + "]";
}


    public int getDays() {
        return days;
    }
    public void setMovieId(String movieId) {
    this.movieId = movieId;
}

public void setDays(int days) {
    this.days = days;
}

    
}
