# FriceEngine

An easy, light weight, native game engine running on JVM.

View [Help](help.md) to learn more about Frice Engine.

# Build

clone and open with IntelliJ IDEA(please install Kotlin, Groovy, Ruby plugin):

clone:
```bash
git clone https://github.com/icela/FriceEngine.git
```

# Use

## Supported

- [X] Kotlin(Native)
- [X] Java
- [X] Groovy
- [ ] JRuby(seemed not working with my project)
- [ ] Scala(I don't know if supported)

## Basic

FriceEngine is based on the life cycle mode.<br/>
When you wanna build games with frice engine, follow these steps:

- Import the jar in the latest release to your project.
- Create a class extends Game in org.frice.game package.
- Implement the abstract methods, just understand them by name.
- call the empty constructor in the public static void main.
- For full API doc please view [help](help.md)

## Demos

- [root/demo/Demo1.java](demo/Demo1.java)
- [root/test/org/frice/game/Demo.kt](test/org/frice/game/Demo.kt)

