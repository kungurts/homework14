public class Main {
    public static void main(String[] args) {


        long[] salesOfYear = {7, 6, 17, 18, 39, 66};
        TrimmedMean sales = new TrimmedMean(salesOfYear);

        System.out.println(sales.trimmedMean());

    }
}
