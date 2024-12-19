package telran.entity.dao;

import telran.entity.model.Entity;
import telran.entity.model.EntityCollection;

import java.util.HashSet;
import java.util.Set;

public class EntityCollectionImplA implements EntityCollection {
    Set<Entity> collection;

    public EntityCollectionImplA() {
        this.collection = new HashSet<>();
    }

    //O(1)
    @Override
    public void add(Entity entity) {
        if (!collection.contains(entity)) {
            collection.add(entity);
        }
    }

    //O(n)
    @Override
    public Entity removeMaxValue() {
        int maxVal = Integer.MIN_VALUE;
        Entity removed = null;
        for (Entity e : collection) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                removed = e;
            }
        }
        collection.remove(removed);
        return removed;
    }
}
