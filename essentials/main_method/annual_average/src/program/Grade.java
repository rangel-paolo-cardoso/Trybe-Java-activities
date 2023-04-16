package program;

public class Grade {

    public float calculateAverage(float... grades) {
        return (grades[0] + grades[1] + grades[2] + grades[3]) / grades.length; 
    }
}
