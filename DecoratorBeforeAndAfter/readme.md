# Decorator Before and After Example

This folder contains Java source code examples that demonstrate how the Decorator design pattern can improve code quality.

- **Before**: The `XmasTree` class handles different decorations (globe, star) using redundant conditional logic.
- **Intermediate**: Several classes are created to represent all combinations of decorations (e.g., `PineS`, `PineGS`), removing redundant decisions but resulting in many classes and less maintainable code.
- **After**: The `Decorator`, `Star`, and `Globe` classes apply the Decorator design pattern to compose decorations dynamically, eliminating redundancy and minimizing the number of classes.

All versions implement the same functionality, but the "after" version is the most flexible, extensible, and follows better object-oriented design practices.

These examples support research on refactoring and demonstrate the benefits of applying design patterns to real-world coding problems.

