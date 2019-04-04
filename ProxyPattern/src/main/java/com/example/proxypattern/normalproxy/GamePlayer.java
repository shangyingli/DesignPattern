package com.example.proxypattern.normalproxy;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(IGamePlayer gamePlayer, String _name) throws Exception{
        if (gamePlayer == null) {
            throw new Exception("无法创建真实角色!");
        }
        this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登陆名为: " + user + "密码为: " + password);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " 在打怪! ");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！ ");
    }
}
