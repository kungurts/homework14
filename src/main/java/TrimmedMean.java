import java.util.Arrays;

public class TrimmedMean {

    protected long[] sales;

    public TrimmedMean(long[] sales) {
        this.sales = sales;
    }

    public long trimmedMean() {
        long trimmed, sum;
        Arrays.sort(sales);
        sum = Arrays.stream(sales).sum() - sales[0] - sales[sales.length-1];
        trimmed = sum / (sales.length - 2);
        return trimmed;
    }
}
