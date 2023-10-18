package lec5.lec5_2023;

public class ContainerExample {
    public static void main(String[] args) {
        User user = new User();
        user.name = "some user";
        Item item = new Item();
        item.price = 27;

        Container<User> userContainer = new Container<>();
        userContainer.setT(user);

        Container<Item> itemContainer = new Container<>();
        itemContainer.setT(item);


        System.out.println(userContainer.getT().name);
        System.out.println(itemContainer.getT().price);
    }

    static class User{
        public String name;
    }

    static class Item{
        public int price;
    }

}
