package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println (dog);
        var cat = 3.6;
        cat = 3.6 + 4;
        cat = cat + 1.6;
        System.out.println (cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper + 7639;
        System.out.println (paper);
        var frog = 3.5;
        System.out.println (frog);
        frog = frog*10;
        System.out.println (frog);
        frog = frog/3.5;
        frog = frog+4;
        System.out.println (frog);
        var x = 78.2;
        var y = 82.7;
        var summ = x+y;
        var diff = y-x;
        System.out.println (summ);
        System.out.println (diff);
        var ost = y%x;
        System.out.println (ost);
        var general = 640;
        var work = 8;
        var number = general / work;
        System.out.println ("Всего работников в компании - " + number + " человек");
        var number_2 = number + 94;
        var newGeneral = work * number_2;
        System.out.println ("Если в компании работает " + number_2 + " человек, то всего " + newGeneral + " часов работы может быть поделено между сотрудниками");
        }
    }
