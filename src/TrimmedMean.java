import java.util.Arrays;

public class TrimmedMean {

    protected int[] sales;

    public TrimmedMean(int[] sales) {
        this.sales = sales;
    }

    public int trimmedMean() {
        int trimmed, sum;
        Arrays.sort(sales);
        sum = Arrays.stream(sales).sum() - sales[0] - sales[sales.length-1];
        trimmed = sum / (sales.length - 2);
        return trimmed;
    }
}
