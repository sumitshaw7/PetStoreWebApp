package com.sample;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.PetType;

public class PetService {

    public List getAvailableBreeds(PetType type){
    	
    	System.out.println("This is a new line to check Jennkin Integration  ,thanks");

        List breeds = new ArrayList();

        if(type.equals(PetType.DOG)){
        	breeds.add("Labradar");
        	breeds.add(("Pommarenian"));

        }else if(type.equals(PetType.CAT)){
        	breeds.add("Black");
        	breeds.add("White");

        }else if(type.equals(PetType.PARROT)){
        	breeds.add("Australian");
        	breeds.add("Maccow");

        }else {
        	breeds.add("No Breed Available");
        }
    return breeds;
    }
}
