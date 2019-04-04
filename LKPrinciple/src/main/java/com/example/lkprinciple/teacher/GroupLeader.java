package com.example.lkprinciple.teacher;

import java.util.List;

public class GroupLeader {

    private List<Gril> gril;

    public GroupLeader(List<Gril> gril) {
        this.gril = gril;
    }

    public void countGirl() {
        System.out.println("女生数量是 : " + this.gril.size());
    }
}
