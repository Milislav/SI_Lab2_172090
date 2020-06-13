import java.util.ArrayList;
import java.util.List;

class Angle {
    int degrees;
    int minutes;
    int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Angle> angleList) { // 1
        List<Integer> result = new ArrayList<>();// 2

        for (int i = 0; i < angleList.size(); i++) { // 3  3.1 3.2 3.3
            int deg = angleList.get(i).getDegrees(); // 4
            int min = angleList.get(i).getMinutes(); // 5
            int sec = angleList.get(i).getSeconds(); // 6
            if (deg >= 0 && deg < 360) { // 7
                if (min < 0 || min > 59) // 8
                    throw new RuntimeException("The minutes of the angle are not valid!"); // 9
                else {
                    if (sec < 0 || sec > 59) // 10
                        throw new RuntimeException("The seconds of the angle are not valid"); //11
                    else
                        result.add(deg * 3600 + min * 60 + sec); // 12
                }
            } else if (deg == 360) { // 13
                if (min == 0 && sec == 0) // 14
                    result.add(deg * 3600 + min * 60 + sec); // 15
                else
                    throw new RuntimeException("The angle is greater then the maximum"); // 16
            } else {
                throw new RuntimeException("The angle is smaller or greater then the minimum"); //17
            }
        } // 18
        return result; // 19

    }

} // 20


