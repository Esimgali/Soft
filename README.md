# Car Manufacturing System

This project is a Car Manufacturing System that demonstrates the use of the Strategy and Factory Method design patterns. It allows you to create different car models with varying engine and brake strategies, as well as interior decoration options.

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
- `ObserverFactory`: Implements the Factory Method pattern using different car providers and notification mechanisms.
- `Database`: Handles database interactions for car providers.

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

### Decorator

Interior decoration options for cars are defined in this package, allowing you to decorate cars with various interior features.

### ObserverFactory

This package implements the Factory Method pattern and uses the Observer pattern to notify clients when a new car is created by a provider. It includes car provider classes such as:

- `ProviderVolvo`
- `ProviderMercedes`
- `ProviderTesla`
- `Provider...` (you can add more provider classes as needed)

These providers create different car models with specific engine and brake strategies and are responsible for notifying clients about the newly created cars.

### Database

This package manages database interactions for car providers, including storing information about the cars.

## Features

- Creation of different car models with varying engine and brake strategies.
- Interior decoration options for cars to customize their interiors.
- Notification mechanism to inform clients about newly created cars.
- Database interaction to store information about the cars created by providers.

## How to Use

1. **Clone the Repository:**
