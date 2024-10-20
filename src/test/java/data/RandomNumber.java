package data;

public class RandomNumber {

    public static Integer getRandomNumber(Integer maxNumber) {
        return (int) (Math.random() * maxNumber);
    }
}
