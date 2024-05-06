package Exo02;

public class OrderService {
    OrderDao od;
    OrderService(OrderDao od)
    {
        this.od=od;
    }
    boolean  createorder(order o)
    {
        return   od.saveorder(o);
    }
}
