package lec3.practice_2023;

public class OrderDetailArray implements OrderDetailsContainer {
    private OrderDetail[] orderDetails;
    private int index;

    public OrderDetailArray() {
        this.orderDetails = new OrderDetail[10];
    }

    @Override
    public void addOrderDetail(OrderDetail orderDetail) {
        if (index + 1 == this.orderDetails.length) {
            extendArray();
        }

        this.orderDetails[index] = orderDetail;
        ++index;
    }

    public void print() {
        for (OrderDetail orderDetail : this.orderDetails) {
            if (orderDetail == null) {
                return;
            }

            System.out.println(orderDetail);
        }
    }

    private void extendArray() {
        int newArraySize = this.orderDetails.length + 10;

        int newArrayIndex = 0;
        OrderDetail[] newArray = new OrderDetail[newArraySize];

        for (OrderDetail orderDetail : orderDetails) {
            newArray[newArrayIndex] = orderDetail;
            ++newArrayIndex;
        }

        this.index = newArrayIndex;
        this.orderDetails = newArray;
    }

    @Override
    public OrderDetail[] getOrderDetails(){
        OrderDetail[] details = new OrderDetail[index + 1];

        for(int i = 0; i < index; i++){
            details[i] = this.orderDetails[i];
        }

        return details;
    }
}
