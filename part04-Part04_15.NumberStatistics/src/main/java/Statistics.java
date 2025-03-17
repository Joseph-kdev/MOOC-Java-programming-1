
public class Statistics {
    private int count;
    private int sum;
    
    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (count < 1) {
            return 0;
        }
        double average = (double)this.sum / this.count;
        return average;
    }
}
