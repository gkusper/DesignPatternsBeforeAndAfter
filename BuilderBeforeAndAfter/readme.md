# Builder Before and After Example

This folder contains Java source code examples that demonstrate how the Builder design pattern can improve code quality.

- **Before**: The `Food` class handles different types of food (pizza, langos) and their attributes (base, toppings) using redundant conditional logic.
- **After**: The construction logic is encapsulated in builder classes: `PizzaBuilder` and `LangosBuilder`. These builders validate and assemble the `Food` objects step-by-step, applying the Builder design pattern. In this way, we can avoid redundant decisions and ensure a cleaner, more maintainable construction process.

Both versions implement the same functionality, but the "after" version eliminates redundancy, improves flexibility, and supports a more robust object creation mechanism.

These examples support research on refactoring techniques and demonstrate the benefits of applying design patterns to object construction.
