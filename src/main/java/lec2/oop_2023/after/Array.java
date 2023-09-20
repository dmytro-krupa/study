package lec2.oop_2023.after;

public class Array {
    private int index = 0;
    private Student[] s;

    public Array(){
        this.s = new Student[10];
    }

    public void addStudent(Student student){
        if(index + 1 == this.s.length) {
            extendArray();
        }

        this.s[index] = student;
        ++index;
    }

    public void print(){
        for(Student student : this.s){
            if(student == null) {
                return;
            }

            System.out.println(student);
        }
    }

    private void extendArray(){
        int newArraySize = this.s.length + 10;

        int newArrayIndex = 0;
        Student[] newArray = new Student[newArraySize];

        for(Student student : s){
            newArray[newArrayIndex] = student;
            ++newArrayIndex;
        }

        /*
        s -> маленький масив
        newArray -> великий масив
        */


        this.index = newArrayIndex;
        this.s = newArray;

     /*
        s -> великий масив
        newArray -> великий масив
        {} -> маленький масив
      */
    }


}
