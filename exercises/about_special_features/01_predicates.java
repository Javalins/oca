package about_special_features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class e1 {
    public static void main(String[] args){
        List<Person> iList = Arrays.asList(
            new Person("Hank", 45),
            new Person("Charlie", 40),
            new Person("Smith", 38)
        );

        /*
        * Which code fragment, when inserted at line n1, enables the code to print Hank?
        */

        //response here: A,B,C,D:
        //checkAge(iList,()-> p.getAge()>40);//a
        //checkAge(iList,Person p -> p.getAge()>40);//b
        checkAge(iList, p -> p.getAge()>40);//c
        //checkAge(iList,(Person p)->{ p.getAge()>40});//d
    }

    public static void checkAge(List<Person> list, Predicate<Person> predicate){
        for (Person p:list){
            if (predicate.test(p)){
                System.out.println(p.name+" ");
            }
        }
    }
}

class Person{
    String name;
    int age;
    public Person(String n,int a){
        name=n;
        age=a;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
}