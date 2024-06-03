package com.jugph.contest.pets;

import com.jugph.contest.behaviors.Feedable;
import com.jugph.contest.behaviors.Playable;
import com.jugph.contest.domain.Pet;

public class Cat extends Pet implements Feedable, Playable {
    public Cat(String name, State state, Pet.Type type) {
        super(name, state, type);
    }

    @Override
    public Food feed() {
        return Food.CatFood;
    }

    @Override
    public void Play(String play) {
        this.setState(State.HAPPY);
        System.out.println("I'm Happy 😃");
    }

    @Override
    protected void talk() {
        System.out.println("MeoOOOw! 🐈");
    }

    @Override
    protected void walk() {
        System.out.println("I'm walkinggg...");
    }
}
