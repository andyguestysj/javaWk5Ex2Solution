## Photoshop Version 1

1. Create a *class* `Circle` which **extends** `Shape` and has a `radius` variable.
2. Create a *class* `Triangle` which **extends** `Shape` and has `base` and `height` variable.
3. Add a area method to Circle and Triangle which calculates the area of each shape. 
  * A circle’s area AC is given by A = πr² where r is the radius. 
  * A triangle’s area AT is given by AT = (bh)/2 where b is the base and h the height
4. In the main method create objects of class Circle and Triangle to test your code.
5. Add constructors to Triangle and Circle which allow you to specify the initial values of all
the classes’ variables.
6. Add an **abstract** `area` method to `Shape`. What does this mean for your `Circle` and `Triangle` classes?
7. Try to add another *subclass* of `Shape` called `Rectangle` (having a `width` and a `height`). See
what happens if you forget to add an `area` method to your `Rectangle` class.
