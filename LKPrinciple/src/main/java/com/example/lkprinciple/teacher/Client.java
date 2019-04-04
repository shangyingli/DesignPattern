package com.example.lkprinciple.teacher;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Gril> grils = new ArrayList<Gril>();
        for (int i = 0; i < 20; i++) {
            grils.add(new Gril());
        }
        Teacher teacher = new Teacher();
        GroupLeader leader = new GroupLeader(grils);
        teacher.command(leader);
    }
}
