public class Main {
    public static void main(String[] args) {


        long[] salesOfYear = {7, 6, 4, 8, 9, 1, 3, 5, 2};
        TrimmedMean sales = new TrimmedMean(salesOfYear);

        System.out.println(sales.trimmedMean());

    }
}
