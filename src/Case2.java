public class Case2 {

    private static Double tax;

    public static void main(String[] args) {
        Double productPriceWithTax = calcProductPriceWithTax(200D);
        System.out.println(productPriceWithTax);
    }

    public static Double calcProductPriceWithTax(Double productPrice) {
        return productPrice + (tax * productPrice / 100);
    }

    public static void updateTaxValue() {
        tax = updateTaxValueFromWebService();
    }
}