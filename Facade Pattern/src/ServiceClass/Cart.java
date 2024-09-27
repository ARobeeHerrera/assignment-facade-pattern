package ServiceClass;

import Interface.HotelService;

public class Cart implements HotelService {
    private Integer carts;

    public void setCarts(Integer carts) {
        this.carts = carts;
    }

    public void requestCart(Integer numberOfCarts) {
        System.out.println("Requesting number of carts: " + numberOfCarts);
    }

    @Override
    public void getService() {
        requestCart(carts);
    }
}
