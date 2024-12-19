package telran.entity.dao;

import telran.entity.model.Entity;
import telran.entity.model.EntityCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EntityCollectionC implements EntityCollection {
    List<Entity> collection;
    Comparator<Entity> comparator = (e1,e2) -> Integer.compare(e1.getValue(),e2.getValue());

    public EntityCollectionC() {
        this.collection = new ArrayList<>();
    }

    //O(n)
    @Override
    public void add(Entity entity) {
        if (!collection.contains(entity)) {
            int index = -Collections.binarySearch(collection,entity,comparator) - 1;
            collection.add(index,entity);
        }
    }

    //O(1)
    @Override
    public Entity removeMaxValue() {
        return collection.removeLast();
    }
}
