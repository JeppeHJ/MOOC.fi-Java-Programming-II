
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.liNumber);
        hash = 97 * hash + Objects.hashCode(this.country);
        return hash;
    }
    
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }
        
        LicensePlate newObject = (LicensePlate) comparedObject;
        
        if (newObject.country.equals(this.country) && newObject.liNumber.equals(this.liNumber)) {
            return true;
        }
        
        return false;
    }

}
