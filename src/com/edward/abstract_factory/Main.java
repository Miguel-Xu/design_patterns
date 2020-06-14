package com.edward.abstract_factory;

import com.edward.abstract_factory.framework.Factory;
import com.edward.abstract_factory.idCard.IDCard;
import com.edward.abstract_factory.idCard.IDCardFactory;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        IDCard card1 = (IDCard) factory.create("Jack");
        IDCard card2 = (IDCard) factory.create("Anna");
        IDCard card3 = (IDCard) factory.create("Bob");
        card1.use();
        card2.use();
        card3.use();
        Map<Integer, String> owners = ((IDCardFactory)factory).getOwners();
        for(Integer key:owners.keySet()){
            System.out.println(key + " " + owners.get(key));
        }

    }
}
