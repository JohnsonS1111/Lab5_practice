public class Calc {
    private int num1;
    private int num2;
    private int ans;

    public Calc(){
        num1 = 0;
        num2 = 0;
        ans = 0;
    }

    public int Divide(int num1, int num2) {
        ans = num1 / num2;
        return ans;
    }
}
