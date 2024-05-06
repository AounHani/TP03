package Exo02;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
// import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class OrderControllerTest {
    @Test
    void createorder() {
        order o=new order();
        o.setName_order("HANI");
        OrderService os=mock(OrderService.class);
        when(os.createorder(o)).thenReturn(true);
        OrderController oc=new OrderController(os);
        boolean result=oc.createorder(o);
        assertEquals(result,true);
        OrderDao od2=mock(OrderDao.class);
        when(od2.saveorder(o)).thenReturn(true);
        OrderService os2=new OrderService(od2);
        boolean result2=os2.createorder(o);
        assertEquals(result2,true);
    }
}