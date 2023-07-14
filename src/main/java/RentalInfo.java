import java.util.HashMap;
public class RentalInfo {
private static final String CODE_REGULAR = "regular";
private static final String CODE_NEW = "new";
private static final String CODE_CHILDRENS = "childrens";

    public String statement(Customer customer) {
    HashMap<String, Movie> movies = new HashMap<>();
    movies.put("F001", new Movie("You've Got Mail", CODE_REGULAR));
    movies.put("F002", new Movie("Matrix", CODE_REGULAR));
    movies.put("F003", new Movie("Cars", CODE_CHILDRENS));
    movies.put("F004", new Movie("Fast & Furious X", CODE_NEW));

    double totalAmount = 0;
    int frequentEnterPoints = 0;
    StringBuilder resultBuilder = new StringBuilder("Rental Record for ").append(customer.getName()).append("\n");
    for (MovieRental r : customer.getRentals()) {
        double thisAmount = 0;
        String movieCode = movies.get(r.getMovieId()).getCode();

        
        if (movieCode.equals(CODE_REGULAR)) {
            thisAmount = 2;
            if (r.getDays() > 2) {
                thisAmount += (r.getDays() - 2) * 1.5;
            }
        } else if (movieCode.equals(CODE_NEW)) {
            thisAmount = r.getDays() * 3;
        } else if (movieCode.equals(CODE_CHILDRENS)) {
            thisAmount = 1.5;
            if (r.getDays() > 3) {
                thisAmount += (r.getDays() - 3) * 1.5;
            }
        }

       
        frequentEnterPoints++;
       
        if (movieCode.equals(CODE_NEW) && r.getDays() > 2) {
            frequentEnterPoints++;
        }

    
        resultBuilder.append("\t").append(movies.get(r.getMovieId()).getTitle()).append("\t").append(thisAmount).append("\n");
        totalAmount += thisAmount;
    }

   
    resultBuilder.append("Amount owed is ").append(totalAmount).append("\n");
    resultBuilder.append("You earned ").append(frequentEnterPoints).append(" frequent points\n");

    return resultBuilder.toString();
}

    
}
