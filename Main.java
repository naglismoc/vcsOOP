package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student();
        st.setSurname("Mockevičius");
        st.setName("Naglis");
        st.setBirthDate(2000);
        System.out.println(st.getCurrentAge());

        Student st2 = new Student("Ignė", "Jurkutė");

        Student.classDescription();
        System.out.println(st);
        System.out.println(st2);


    }
}
