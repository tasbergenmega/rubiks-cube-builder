# Rubik's Cube Builder

Assignment 1 for the Builder pattern.
I built a Rubik's Cube configurator in Java.

## What it does
The builder collects a cube step by step:
- size (2..7)
- tension (1..5)
- lubricated or not
- sticker type (stickerless / stickers / tiles)
- magnetic core or not
- color scheme (Western / Japanese)

The same steps can produce two different results — that's the point of the pattern.

## Two representations
1. RubiksCube object — built by RubiksCubeObjectBuilder
2. Text spec sheet — built by RubiksCubeSpecBuilder

## Director
RubiksCubeDirector has two ready configurations:
- makeSpeedcube() — 3x3, tension 3, lubed, stickerless, magnetic
- makeBudgetCube() — 3x3, tension 1, not lubed, stickers, no magnets

The director only knows the RubiksCubeBuilder interface, not the concrete builders.

## Validation
getResult() checks the state and throws IllegalStateException if something is wrong:
- size not in 2..7
- tension not in 1..5
- sticker type or color scheme is missing

## Files
src/RubiksCube.java — immutable product
src/RubiksCubeBuilder.java — builder interface
src/RubiksCubeObjectBuilder.java — builds the object
src/RubiksCubeSpecBuilder.java — builds the text
src/RubiksCubeDirector.java — ready configurations
src/Main.java — client

## How to run
Compile all files and run Main.main().
It prints the object, then the text spec, then a caught validation error.
