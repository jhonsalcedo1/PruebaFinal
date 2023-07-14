

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Customer {
    private String name;
    private List<MovieRental> rentals;

    public Customer(String name, List<MovieRental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public List<MovieRental> getRentals() {
        return rentals;
    }
    public void addRental(MovieRental rental) {
    rentals.add(rental);
}

public void removeRental(MovieRental rental) {
    rentals.remove(rental);
}
@Override
public String toString() {
    return "Customer[name=" + name + ", rentals=" + rentals + "]";
}

    
}
