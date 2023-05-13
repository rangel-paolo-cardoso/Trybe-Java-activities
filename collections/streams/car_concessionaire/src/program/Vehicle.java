package program;

public final class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    /** 
     * HashCode method for Vehicle class.
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    
    /** 
     * Equals method for Vehicle class, used to allow comparison between two objects.
     * @param obj an Object of type Vehicle.
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle: " + name;
    }

}
