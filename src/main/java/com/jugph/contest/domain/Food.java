package com.jugph.contest.domain;

public class Food {
    private Pet pet;

    public Food(Pet pet) {
        this.pet = pet;
    }

    public String getFood() {
        switch (pet.getType()){
            case CAT: {
                return "Cat Food.";
            }
            case DOG: {
                return "Dog Food.";
            }
            case RABBIT: {
                return "Rabbit Food.";
            }
            case PARROT: {
                return "Parrot Food.";
            }
            case TURTLE: {
                return "Turtle Food.";
            }
            case HAMSTER: {
                return "Hamster Food.";
            }
            case FISH: {
                return "Fish Food.";
            }
            case MOUSE: {
                return "Mouse Food.";
            }
            case GUINEA_PIG: {
                return "Guinea Pig Food.";
            }
            default: {
                return "Food for this pet doesn't exit...";
            }
        }
    }
}
