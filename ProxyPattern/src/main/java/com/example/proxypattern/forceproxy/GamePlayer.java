package com.example.proxypattern.forceproxy;

public class GamePlayer implements IGamePlayer {

    private String name;
    private IGamePlayer proxy;

    public GamePlayer(String _name) throws Exception{
        this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        if (isProxy()) {
            System.out.println("登陆名为: " + user + "密码为: " + password);
        } else {
            System.out.println("请使用指定代理访问!");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.println(this.name + " 在打怪! ");
        } else {
            System.out.println("请使用指定代理访问!");
        }
    }

    @Override
    public void upgrade() {
        if (isProxy()) {
            System.out.println(this.name + " 又升了一级！ ");
        } else {
            System.out.println("请使用指定代理访问!");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
