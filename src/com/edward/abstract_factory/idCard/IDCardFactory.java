package com.edward.abstract_factory.idCard;

import com.edward.abstract_factory.framework.Factory;
import com.edward.abstract_factory.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private Map<Integer,String> owners = new HashMap<>();
    private int serial = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard)product;
        owners.put(idCard.getSerial(),idCard.getOwner());
    }

    public Map<Integer, String> getOwners() {
        return owners;
    }
}
