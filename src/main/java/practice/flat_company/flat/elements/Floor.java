package practice.flat_company.flat.elements;

public class Floor {
    public int getPrice(){
        return 100;
    }

    public static Floor getTileFloor(){
        return new Floor(/*тут задаємо правильні матеріали*/);
    }
}
