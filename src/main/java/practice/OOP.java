package practice;

public class OOP {
    /*
        Інкапсуляція - приховування реалізації

        class Car{
            private String brand;
            private Engine engine;

            public void start(){
                engineStart();
            }

            private void engineStart(){
            ...

            ...

            ...
            };
        }



        Успадкування - створення ієрархій і перевикористання коду

        abstract class Person{
            private String name;
            private String surname;

            public String getName(){
                return this.name;
            }
            //getters and setters
        }

        class Student extends Person{
            private int mark;
            private int studentShip;

             //getters and setters
         }
        class Professor extends Person{
            private int salary;

            @Override
            public String getName(){
                return "pr. " + this.name;
            }
            //getters and setters
          }

        Поліморфізм --- один інтерфейс - багато форм

        Student andrii = new Student(...);
        Student restislav = new Student(...);

        Professor dmytro = new Professor(...);


        List<Person> persons = new ArrayList<>();

        persons.add(andrii);
        persons.add(restislav);
        persons.add(dmytro);

        for(Person person : persons){
            sout(person.getName() + " " + person.getSurname());
        }


        Абстракція --- відкидання деталей - зосередження на узагальненнях

        class Student {
            private String name;
            private String surname;
            private int mark;
            private int age;
            private int studentShip;

            }


     */
}
