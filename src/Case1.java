public class Case1 {

    public static void main(String[] args) {
        Double productPriceWithTax = calcProductPriceWithTax(200D, 20D);
        System.out.println(productPriceWithTax);
    }

    public static Double calcProductPriceWithTax(Double productPrice, Double tax) {
        return productPrice + (tax * productPrice / 100);
    }
}
