# Car Manufacturing System

This project is a Car Manufacturing System that demonstrates the use of the Strategy,Factory Method, Singleton, Decorator, Adapter and Observer design patterns. It allows you to create different car models with varying engine and brake strategies, as well as interior decoration options, and also manages notifications.

## Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [How to Use](#how-to-use)
- [Design Patterns](#design-patterns)
- [Contributors](#contributors)

## Project Structure

The project is organized into the following packages:

- `Strategy`: Contains classes and interfaces related to different car strategies, including engine and brake strategies.
- `Decorator`: Provides interior decoration options for cars.
- `Observer`: Implements the pattern using notification mechanisms for notifying users about newly added cars.
- `Database`: Handles database interactions for car providers.
- `Adapter`: Adapts and provides compatibility for existing `ProviderTesla` classes to work with the `CarProvider` interface.
- `FactoryMethod`: Implements the Factory Method pattern for creating car providers.

### Strategy

This package includes various strategies for engines and brakes:

- `IEngineStrategy`: An interface for different engine strategies.
- `IBrakesStrategy`: An interface for different brake strategies.
- Concrete classes implementing these interfaces:
  - `ElectricMotor`
  - `DieselEngine`
  - `GasolineEngine`
  - `GasEngine`
  - `HybridEngine`
  - `DiscBrakes`
  - `DrumBrakes`

### Adapter

The Adapter package includes AdapterProviderTesla class that adapts the CarProvider interface to work seamlessly with a ProviderTesla object. It achieves this adaptation by modifying the behavior of certain methods to match the expected interface.

-`getBrakesRadius()`: Adjusts the brakes radius based on the existing implementation.
-`getEngineHorsepower()`: Retains the engine horsepower information without modification.
-`getMaximumMileage()`: Adjusts the maximum mileage based on the existing implementation.
-`getDescription()`: Retains the original description.

The purpose of this adapter is to make a ProviderTesla object compatible with the CarProvider interface, allowing existing code that expects a CarProvider to work seamlessly with a ProviderTesla instance.

### FactoryMethod

The CreateProvider class in FactoryMethod package serves as a Factory Method responsible for creating instances of different car providers based on specified parameters. It follows the Factory Method design pattern, which provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. In this context, the CreateProvider factory method generates instances of classes implementing the CarProvider interface.

-`createProvider(IEngineStrategy engine, IBrakesStrategy brakes, CarInterior inter, String type)`
This method takes in various parameters representing the car's engine strategy, brakes strategy, interior decoration, and a type identifier. It then dynamically creates and returns an instance of a class implementing the CarProvider interface based on the specified type.

### Decorator

The `Decorator` package provides various interior decoration options for cars, allowing you to customize and enhance the interior features of different car models. It includes the following decorator classes:

- `AirConditioner`: Implements the `CarInterior` interface and adds an air conditioning system to the car's interior.
- `ImprovedAudioSystem`: Implements the `CarInterior` interface and enhances the car's audio system for a premium listening experience.
- `Interior`: Implements the `CarInterior` interface and serves as the base class for decorating the car's interior.
- `LeatherInterior`: Implements the `CarInterior` interface and adds a luxurious leather interior to the car.
- `MultifunctionSteeringWheel`: Implements the `CarInterior` interface and enhances the steering wheel with multifunctional features.
- `Tinting`: Implements the `CarInterior` interface and provides window tinting for added privacy and protection.

These decorator classes allow you to customize and combine interior features to create unique car configurations tailored to your preferences.

### User and RootUser

The `User` class and the `RootUser` class are integral parts of the project's user management system.

#### User

The `User` class is responsible for adding new users to the system. It allows you to create and store user information in the database. The class includes the following methods:

- `addNewUser(username, usersurname, useremail, userphonenumber, shippingmethod)`: Adds a new user to the system by providing their username, surname, email, phone number, and preferred shipping method.

#### RootUser

The `RootUser` class is a singleton class responsible for managing user data, including deleting users and retrieving user information. It ensures the integrity of user data and provides essential administrative functionality. The class includes the following methods:

- `deleteUser(userId)`: Deletes a user from the system by specifying the user's ID.
- `getUsers()`: Retrieves and displays a list of all users stored in the database.

These classes collectively form the user management system, allowing you to create and manage user accounts securely.

### ObserverFactory

This package implements the Factory Method pattern and uses the Observer pattern to notify clients when a new car is created by a provider. It includes car provider classes such as:

- `ProviderVolvo`
- `ProviderMercedes`
- `ProviderTesla`
- `Provider...` (you can add more provider classes as needed)

These providers create different car models with specific engine and brake strategies and are responsible for notifying clients about the newly created cars.

### Database

The `Database` package is used to manage database interactions for user information, including user accounts and root user. It ensures the security and integrity of user data.

## Features

- Creation of different car models with varying engine and brake strategies.
- Interior decoration options for cars to customize their interiors.
- Notification mechanism to inform clients about newly created cars.
- Database interaction to store information about the cars created by providers.

## How to Use

1. **Clone the Repository:**
 git clone <repository_url>
2. **Compile and Run:**
Compile and run the project to create and manage different car models using the provided strategies and providers.

## Design Patterns

This project demonstrates the following design patterns:

- **Strategy Pattern**: Used to define a family of interchangeable car strategies (engine and brake) and make them independently selectable.
- **Factory Method Pattern**: Implemented through car providers, allowing the creation of different car models without specifying their concrete classes.
- **Adapter Pattern**: Illustrated with the `AdapterProviderTesla` class, which adapts a `ProviderTesla` instance to the `CarProvider` interface.
- **Observer Pattern**: Utilized for notifying users about newly added cars in the store.
- **Decorator Pattern**: This pattern enables the dynamic addition of new interior features to cars by wrapping them with decorator classes such as `AirConditioner`, `ImprovedAudioSystem`, `LeatherInterior`, and more, allowing for a modular and customizable approach to enhancing car interiors.
- **Singleton Pattern**: The `RootUser` class is implemented as a singleton, providing a single, globally accessible instance for managing user data and administering essential user-related functionalities.
  
## Contributors

- Esimgali Khamitov(https://github.com/Esimgali)
- Bakeyeva Darina(https://github.com/vuilae)
