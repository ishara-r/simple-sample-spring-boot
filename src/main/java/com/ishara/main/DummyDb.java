package com.ishara.main;

import java.util.ArrayList;
import java.util.List;

public class DummyDb {
    //TODO remove follow
    private static List<Emp> list = new ArrayList<>();

    DummyDb() {
        //TODO remove follow
        Emp emp1 = new Emp();
        emp1.setAge(1);
        emp1.setName("name1");
        list.add(emp1);

        Emp emp2 = new Emp();
        emp2.setAge(1);
        emp2.setName("name1");
        list.add(emp2);
    }

    public void add(Emp emp) {
        //TODO replace this with db call
        list.add(emp);
    }

    public List<Emp> getAllEmp() {
        //TODO replace this with db call
        return new ArrayList<Emp>(list);
    }
}
