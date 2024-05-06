package Exo02;



public class OrderController {

    OrderService os;
    OrderController(OrderService os)
    {
        this.os=os;
    }
    boolean createorder(order o)
    {
        return os.createorder(o);
    }
}
