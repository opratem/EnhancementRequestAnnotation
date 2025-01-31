# Enhancement Request Annotation

This project demonstrates how to create and use a custom annotation in Java for tracking enhancement requests.

## Annotation Details
- **Annotation Name**: `@EnhancementRequest`
- **Elements**: `id`, `synopsis`, `engineer`, `date`
- **Default Values**: `engineer = "unassigned"`, `date = "unknown"`

## Usage
```java
@EnhancementRequest(
    id = 158,
    synopsis = "Improve Perfomance",
    engineer = "Praise Olufemi",
    date = "01-30-2025"
)
public class ImprovePerfomance {
    // Class implementation
}
