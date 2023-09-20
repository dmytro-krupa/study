package lec3.practice_2023;

public interface OrderDetailsContainer {
    void addOrderDetail(OrderDetail orderDetail);
    OrderDetail[] getOrderDetails();
}

