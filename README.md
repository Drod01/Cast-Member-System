# Cast-Member-System

This Java project is designed to manage and display information about shows, including details about the cast members and their roles. It's a simple yet comprehensive system that can be utilized for educational purposes or as a basis for more complex projects.

## Project Structure

The project is structured into several key classes, each serving a distinct purpose within the application:

- **Person.java**: Defines a base `Person` class, which may include common attributes such as name, age, and contact information.
- **CastMember.java**: Extends the `Person` class or closely interacts with it, tailored specifically for individuals who are cast members of a show, potentially including their specific roles.
- **Role.java**: Represents the various roles within a show that a `CastMember` can hold, detailing the responsibilities or characteristics of each role.
- **Show.java**: Encapsulates information about a show, such as its title, genre, and a list of cast members and their roles.
- **Main.java**: Serves as the entry point of the application, where instances of the other classes are created and managed to demonstrate the application's functionality.

## Setup and Execution

To set up and run this project, follow these steps:

1. Ensure you have Java installed on your system. This project was developed to be compatible with Java SE 8 or later.
2. Import the project into an IDE that supports Java development, such as Eclipse or IntelliJ IDEA. The project includes specific configuration files for Eclipse, but it can be adapted for use in other environments.
3. Navigate to the `Main.java` file, located within the `src` directory. This file contains the `main` method, which is the starting point of the application.
4. Compile and run `Main.java` to start the application. The IDE should handle compilation and execution, but you can also use command-line tools like `javac` and `java` if preferred.

## Extending the Project

This project serves as a foundation for managing show and cast member information. Consider extending it by:

- Adding a GUI to make the application more interactive and user-friendly.
- Implementing a database to store and retrieve information persistently.
- Expanding the functionality to include scheduling, rehearsals, and other aspects of show production.

## License

This project is open-source and free to use for educational purposes. Feel free to fork, modify, and extend it to suit your learning or development needs.
