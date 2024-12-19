package telran.entity.dao;

import telran.entity.model.Entity;
import telran.entity.model.EntityCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class EntityCollectionImplB implements EntityCollection {
    TreeSet<Entity> collection;
    Comparator<Entity> comparator = (e1, e2) -> Integer.compare(e1.getValue(),e2.getValue());

    public EntityCollectionImplB() {
        this.collection = new TreeSet<>(comparator);
    }

    //O(log(n))
    @Override
    public void add(Entity entity) {
        if (!collection.contains(entity)) {
            collection.add(entity);
        }
    }

    //O(log(n))
    @Override
    public Entity removeMaxValue() {
        return collection.removeLast();
    }
}
