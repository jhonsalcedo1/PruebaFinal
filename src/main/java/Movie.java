
/**
 *
 * @author Usuario
 */
public class Movie {
    private String title;
    private String code;

    public Movie(String title, String code) {

        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }
    
public void setTitle(String title) {
    this.title = title;
}

public void setCode(String code) {
    this.code = code;
}

    public String getCode() {
        return code;
    }
   /* public String toString() {
    return "Movie[title=" + title + ", code=" + code + "]";
}*/
    @Override
public String toString() {
    return "Movie[title=" + title + ", code=" + code + "]";
}

    

    
}
