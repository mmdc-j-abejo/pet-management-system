/**
 * MIT License
 * Copyright (c) 2024 Tristan Mahinay
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * pet-management-system
 *
 * @author rjtmahinay
 * 2024
 */
package com.jugph.contest;

import com.jugph.contest.domain.Owner;
import com.jugph.contest.domain.Pet;
import com.jugph.contest.manager.PetManager;
import com.jugph.contest.pets.Cat;
import com.jugph.contest.pets.Dog;

import java.util.ArrayList;

public class PetManagementSystem {

    public static void main(String[] args) {

        /*
         * This is the main class. This will be used for printing the results.
         */

        /**
         * The owner of the primary pets is Jomari
         */

        Owner owner = new Owner();
        owner.setOwner("Jomari Abejo");
        owner.setGender(Owner.Gender.MALE);

        /**
         * My First Pet
         */

        String primaryPetName = "Blackie";
        Pet.State primaryPetState = Pet.State.HAPPY;

        Dog primaryPet = new Dog(
                primaryPetName,
                primaryPetState,
                Pet.Type.DOG){
        };

        /**
         * My Secondary Pet
         */

        String secondaryPetName = "Salem";
        Pet.State secondaryPetState = Pet.State.SAD;

        Cat secondaryPet = new Cat(
                secondaryPetName,
                secondaryPetState,
                Pet.Type.CAT) {
        };

        ArrayList<Pet> ownerPets = new ArrayList<Pet>();
        ownerPets.add(primaryPet);
        ownerPets.add(secondaryPet);


        PetManager petManager = new PetManager();
        petManager.setOwner(owner);
        petManager.setPets(ownerPets);


        /**
         * The owner of the primary pets is AJ
         */


        ArrayList<PetManager> petManagers = new ArrayList<PetManager>();
        petManagers.add(petManager);


        // Display All owner with their pets
        petManagers.stream().forEach
        (
            petOwner ->
            {
                petManager.start();
                petOwner.displayOwner();
                petOwner.displayPets();
                petManager.close();
            }
        );
    }
}
