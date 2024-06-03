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
package com.jugph.contest.manager;

import com.jugph.contest.domain.Owner;
import com.jugph.contest.domain.Pet;

import java.util.ArrayList;

public class PetManager {

    // Add an owner
    private Owner owner;
    // Add a pet to an owner
    private ArrayList<Pet> ownerPets;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ArrayList<Pet> getOwnerPets() {
        return ownerPets;
    }

    public void setPets(ArrayList<Pet> ownerPets) {
        this.ownerPets = ownerPets;
    }
    public void displayPets() {
        int ownerNumberOfPets = this.ownerPets.size();
        if (ownerNumberOfPets == 0) {
            System.out.println("------------------------------------------------------");
            System.out.println("                     NO PETS FOUND                   -");
            System.out.println("------------------------------------------------------");
        }
        else if (ownerNumberOfPets == 1) {
            System.out.println(
                    "Name: "+this.getOwnerPets().get(0).getName()+ "\n"+
                    "Type: "+this.getOwnerPets().get(0).getType()+ "\n"+
                    "State: "+this.getOwnerPets().get(0).getState()
            );
        }

        else {
            System.out.println("------------------------------------------------------");
            System.out.println("|                 PETS INFORMATION                   |");
            System.out.println("------------------------------------------------------");

            System.out.println("------------------------------------------------------");
            System.out.printf("| %-20s | %-10s | %-20s |\n", "Name", "Type", "State");
            System.out.println("------------------------------------------------------");
            for (Pet pet : this.ownerPets) {
                System.out.printf("| %-20s | %-10s | %-14s |\n", pet.getName(), pet.getType(), pet.getState());
            }
            System.out.println("------------------------------------------------------");
        }

    }
    public void start() {
        System.out.println("------------------------------------------------------");
        System.out.println("-              Pet Manager Start                     -");
        System.out.println("------------------------------------------------------");

    }
    public void displayOwner() {
        System.out.println("------------------------------------------------------");
        System.out.printf("| %-50s |\n", "Owner     : " + this.getOwner().getOwnerName());
        System.out.println("------------------------------------------------------");
    }

    public void close() {
        System.out.println("------------------------------------------------------");
        System.out.println("-              Pet Manager End                       -");
        System.out.println("------------------------------------------------------");
    }
}
