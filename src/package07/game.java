package package07;

public class game{
    private String N;
    private String A;
    private String Pn;
 
    public game() {
 
    }
 
    public game(String N, String A, String Pn) {
        super();
        this.N = N;
        this.A = A;
        this.Pn = Pn;
    }
 
    public String getN() {
        return N;
    }
 
    public void setN(String N) {
        this.N = N;
    }
 
    public String getA() {
        return A;
    }
 
    public void setA(String A) {
        this.A = A;
    }
 
    public String getPN() {
        return Pn;
    }
 
    public void setPN(String PN) {
        this.Pn = Pn;
    }
 
    public String toString() {
        return N + " " + A + " " + Pn;
    }
}