public class Main {
    public static void main(String[] args) {

        long[] salesOfYear = {12, 4, 38, 17, 39, 4};
        SalesManager sales = new SalesManager(salesOfYear);

        System.out.println(sales.max());

    }
}
