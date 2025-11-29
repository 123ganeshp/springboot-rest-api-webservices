# Spring Boot Product CRUD Application

This project contains basic CRUD operations using Spring Boot and MySQL.

## Tech Stack
Java 17
Spring Boot
Spring Web
Spring Data JPA
MySQL
Lombok
ModelMapper
Validation API (Jakarta Validation / Hibernate Validator)

## Features
- Add Product
- Update Product
- Delete Product
- Get Products

More features will be added using Git branching strategy:

## CRUD (main branch initial version)
Basic Create, Read, Update, Delete operations for Product entity
JPA + MySQL
Controller → Service → Repository structure

## DTO Pattern (dto branch)
✔ Purpose
To separate API layer objects from database entity objects.
✔ What was done
Created ProductDTO to expose safe fields
Added ModelMapper (or manual mapping logic)
Updated Controller to use DTOs instead of Entity
Converted service response using DTO mapping
Ensured clean and maintainable request/response structure
✔ Benefits
Hides internal database structure
Provides control over data exposed
Makes API stable even if Entity changes

## Global Exception Handling (exception-handling branch)
✔ Purpose
To return meaningful, consistent error responses for client requests.
✔ What was done
Implemented GlobalExceptionHandler using @ControllerAdvice
Handled common exceptions like:
ResourceNotFoundException
EmailAlreadyExists
IllegalArgumentException
- Created a unified ApiErrorResponse structure with:
timestamp
message
status
path
✔ Benefits
Cleaner controllers
Same error format everywhere
Easy debugging for users and developers

## Validation (feature/validation branch)
✔ Purpose
To validate incoming API requests before processing.
✔ What was done
Added validation annotations like:
@NotBlank
@Size
@Email
@Min / @Max
Added custom validation messages in messages.properties
Used @Valid in controller request bodies
Enhanced exception handler to return field-level errors
✔ Benefits
Prevents invalid data from entering the system
Cleaner API behavior
Reduces runtime issues due to bad input


