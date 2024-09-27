package ServiceClass;

import Interface.HotelService;

public class Cart implements HotelService {
    Integer numberOfCarts;

    public void setNumberOfCarts(Integer numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart() {
        System.out.println("Requesting number of carts: " + numberOfCarts);
    }

    @Override
    public void getService() {
        requestCart();
    }
}
