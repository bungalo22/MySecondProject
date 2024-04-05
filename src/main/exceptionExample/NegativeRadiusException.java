package exceptionExample;

public class NegativeRadiusException extends Exception {
    int r;
    public NegativeRadiusException() {
    }

    public NegativeRadiusException(int r) {
        this.r = r;
    }
    public int getR() {
        return r;
    }
}
