package dao;

import bean.Hero;

import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Hero> list=new HeroDAO().list(0,5);
//        for (Hero hero : list) {
//            System.out.println(hero.toString());
//        }
        int num=new HeroDAO().getTotal();
        System.out.println(num);
    }
}
