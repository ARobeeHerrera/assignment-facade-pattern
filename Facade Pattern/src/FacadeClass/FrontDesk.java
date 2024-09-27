package FacadeClass;

import ServiceClass.*;

public class FrontDesk {
    public Cart cart;
    public HouseKeeping houseKeeping;
    public Valet valet;

    public FrontDesk() {
        cart = new Cart();
        houseKeeping = new HouseKeeping();
        valet = new Valet();
    }
}
