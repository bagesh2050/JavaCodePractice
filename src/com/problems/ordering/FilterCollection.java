package com.problems.ordering;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class FilterCollection {
    public static void main(String[] args)
    {
        List<String> personNames= Arrays.asList("Mal","Wash","Kaylee","Inara","Zoe","Jayne","Simon","iver","Shepherd Book");
        Optional<String> optPerson=findNameStartsWithR(personNames);
        
        if(optPerson.isPresent()) {
        	String value = optPerson.get();
        	System.out.println("First Name starting with R present in the collection is "+value);
        }else {
        	System.out.println("No any name starting with R present in the collection");
        }
        
		/*
		 * optPerson.ifPresentOrElse((value)->System.out.
		 * println("First Name starting with R present in the collection is "+value),
		 * ()->System.out.
		 * println("No any name starting with R present in the collection"));
		 */
    }
    public static Optional<String> findNameStartsWithR(List<String> personNames)
    {
        return personNames.stream().filter(name->name.startsWith("R")).coll
    }
}


