# Bridge Before and After Example

This folder contains Java source code examples that demonstrate how the Bridge design pattern can improve code quality.

- **Before**: The `Purchase` class handles different client types (company or personal) and different payment methods (cash or bankcard) using redundant conditional logic.
- **After**: The responsibilities are separated into two hierarchies: `CompanyPurchase`/`PersonalPurchase` for client types, and `PayByCash`/`PayByBankcard` for payment types. These hierarchies are connected via composition, applying the Bridge design pattern. In this way, we can avoid redundant decisions.

Both versions implement the same functionality, but the "after" version eliminates redundancy, reduces complexity, and improves modularity.

These examples support research on refactoring techniques and illustrate how applying design patterns leads to cleaner, more maintainable object-oriented code.
