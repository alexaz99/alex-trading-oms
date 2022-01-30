package alex.trading.oms.model.json;

public class JsomTemplateObject {

    public static void main(String[] args) {
        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setCountryName("US");
        shippingAddress.setStreetAddress("123 Main St.");
        shippingAddress.setExtendedAddress("New York, NY");
        shippingAddress.setAdditionalProperty("Florida", new Object());
        shippingAddress.setPostalCode("10024");
        shippingAddress.setLocality("Local");
        shippingAddress.setCountryName("US");
        shippingAddress.setRegion("East");

        System.out.println(shippingAddress);

        System.out.println(shippingAddress.toString());
    }

}
