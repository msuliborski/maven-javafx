# Maven JavaFX Template
Template for modular java application using Maven with JavaFX, JUnit and Jacoco included. </br>
<!-- <p align="center">
  <img width="280" src="images/1.png">
  <img width="280" src="images/2.png">
  <img width="280" src="images/3.png">
</p> -->

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
In order to properly build application one might need following dependences.
```
$ sudo apt install openjdk-13-jdk openjfx
```

### Cloning
```
$ git clone https://github.com/msuliborski/maven-javafx-template
```

### Building
```
$ cd maven-javafx-template/
$ mvn install
```

### Usage
To run GUI version of the program execute following comands
```
$ cd GUI/
$ mvn clean javafx:run
```

## Built with
* [JavaFX](https://openjfx.io/) - open source, next generation client application platform for desktop, mobile and embedded systems built on Java.

## Authors
* **Michał Suliborski** - [msuliborski](https://github.com/msuliborski)=

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
