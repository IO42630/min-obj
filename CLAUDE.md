# min-obj

## Purpose
Utility objects and data structures including time-based pairs, cubes, and common object operations.

## Guidelines
- **Architecture**: Utility data structures and helper classes
- **Dependencies**: Minimal external dependencies
- **Parent**: **URGENT**: Update from min-root 17.0.2 to 21.0.0
- **Key Classes**: InstantCube, InstantPair, Pair, BooleanUtils
- **Usage**: Common data structures and utilities

## Key Features
- InstantCube: Time-based cube operations
- InstantPair: Time-based key-value pairs
- Generic Pair: Simple two-element container
- BooleanUtils: Boolean operation utilities

## Code Patterns
```java
// Generic pairs
Pair<String, Integer> nameAge = new Pair<>("John", 30);
String name = nameAge.getFirst();
Integer age = nameAge.getSecond();

// Time-based pairs
InstantPair<String> timedData = new InstantPair<>(Instant.now(), "data");
Instant timestamp = timedData.getInstant();
String value = timedData.getValue();

// Boolean utilities
boolean result = BooleanUtils.and(condition1, condition2, condition3);
```

## Maintenance
- **URGENT**: Update parent to min-root (21.0.0)
- Keep data structures lightweight and efficient
- Maintain immutability where appropriate
- Ensure proper equals() and hashCode() implementations
- Consider adding more utility methods as patterns emerge

## Design Principles
- Prefer immutable objects where possible
- Keep API simple and predictable
- Ensure thread safety for utility methods
- Maintain backwards compatibility