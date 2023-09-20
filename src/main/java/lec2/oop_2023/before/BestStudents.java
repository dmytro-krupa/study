package lec2.oop_2023.before;

public class BestStudents {
    public static void main(String[] args) {

        int n = 4;

        String student1 = "Dmytro 100";
        String student2 = "Olha 99";
        String student3 = "Inna 98";
        String student4 = "Orest 90";



//  ====================================================================

        String[] s = new String[n];

        s[0] = student1;
        s[1] = student3;
        s[2] = student2;
        s[3] = student4;


        for(String student : s){
            System.out.println(student.split(" ")[1]);
        }
    }
}
