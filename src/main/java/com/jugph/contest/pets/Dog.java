package com.jugph.contest.pets;

import com.jugph.contest.behaviors.Feedable;
import com.jugph.contest.behaviors.Playable;
import com.jugph.contest.domain.Pet;

public class Dog extends Pet implements Feedable, Playable {


    public Dog(String name, Pet.State state, Pet.Type type) {
        super(name, state, type);
    }

    @Override
    protected void talk() {
        System.out.println("I'm Barking...");
        setState(State.HUNGRY);
    }

    @Override
    protected void walk() {
        System.out.println("I'm Walking...");
        setState(State.HUNGRY);
    }

    @Override
    public Pet.Food feed() {
        return Food.DogFood;
    }

    @Override
    public void Play(String play) {
        System.out.println("I'm Playing...");
    }
}
