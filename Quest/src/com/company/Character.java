package com.company;

public class Character {
    public int S; //Сладость (Дружелюбие)
    public int K; //Крепкость (Стойкость, смелость)
    public int M; //Мягкость (Доброта)
    public String name;
    public Character(String name){
        S=5;
        K=0;
        M=5;
        this.name=name;
    }
}
