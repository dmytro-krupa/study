package lec3.practice_2023;

import java.time.LocalDateTime;

public class Order {

    private Long id;
    private LocalDateTime createdAt = LocalDateTime.now();
    private Vendor vendor;

    private OrderDetailsContainer orderDetails;

    public Order(Vendor vendor, OrderDetailsContainer orderDetails) {
        this.id = IdGenerator.getOrderId();

        this.vendor = vendor;
        this.orderDetails = orderDetails;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(final Vendor vendor) {
        this.vendor = vendor;
    }

    public OrderDetailsContainer getOrderDetails() {

        return orderDetails;
    }

    public void setOrderDetails(OrderDetailsContainer orderDetails) {
        this.orderDetails = orderDetails;
    }

    public double getTotalPrice() {
        double sum = 0;

        for (OrderDetail orderDetail : this.orderDetails.getOrderDetails()) {

            //Варіант 1. Пропускати елемнт, якщо він є пустий.
            //Варіант 2. Переписати getOrderDetails щоб отримати копію масиву з відповідним розміром
            if (orderDetail == null) {
                continue;
            }

            sum += orderDetail.getItem().getPrice() * orderDetail.getQuantity();
        }

        return sum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
