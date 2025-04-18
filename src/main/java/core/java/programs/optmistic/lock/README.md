In this example, 
the Product entity has a version field annotated with @Version. 
This field will be automatically incremented by JPA each time the entity is updated. 
If another transaction has updated the entity since it was last read, an OptimisticLockException will be thrown.