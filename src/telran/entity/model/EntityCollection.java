package telran.entity.model;

public interface EntityCollection {
    public void add(Entity entity);
    public Entity removeMaxValue();
}
