# GreedingCard
A simple Android application showcasing a greeting card using [Jetpack Compose](https://developer.android.com/jetpack/compose/why-adopt), Google's modern UI toolkit for Android development.

... Preview of the GreedingCard application

## Table of Contents
1. Introduction
2. Code Overview
    - GreetingCard Composable
    - MainActivity
3. Usage
4. Dependencies
5. License

### Introduction
GreedingCard is a simple Android application that demonstrates how to create a greeting card using Jetpack Compose. The card consists of a user's profile picture, name, role, and contact information.

### Code Overview

#### GreetingCard Composable
The `GreetingCard` composable is the main building block of the application. It is responsible for rendering the user's profile picture, name, role, and contact information.

#### Structure
The `GreetingCard` composable is built using a `Surface` composable that takes up the full screen and has a primary color as its background. Inside the Surface, there are two main columns:
1. The first column contains the user's profile picture and name/role information.
2. The second column contains the user's contact information, such as phone number, email, and social media handles.

#### Key Components
- `Surface`: A container composable that provides a background color and elevation.
- `Image`: A composable for displaying an image.
- `Text`: A composable for displaying text.
- `Row`: A composable for arranging composables horizontally.
- `Spacer`: A composable for adding space between composables.

#### MainActivity
The `MainActivity` class is the entry point of the application. It sets the content of the activity to the `GreetingCard` composable with the user's name and role.

### Usage
To use the `GreetingCard` composable in your project, simply import the package and use the `GreetingCard` composable with the desired name and role.

```kotlin
import com.example.greedingcard.GreetingCard

GreetingCard("John Doe", "Software Engineer")
```

### Dependencies
The project has the following dependencies:
- `androidx.core:core-ktx:1.12.0`
- `androidx.lifecycle:lifecycle-runtime-ktx:2.7.0`
- `androidx.activity:activity-compose:1.8.2`
- `androidx.compose:compose-bom:2023.08.00"`
- `androidx.compose.ui:ui`
- `androidx.compose.ui:ui-graphics`
- `androidx.compose.ui:ui-tooling-preview`
- `androidx.compose.material3:material3`

Add these dependencies to your `build.gradle` file to use Jetpack Compose in your project.

### License
This project is licensed under the MIT License - see the LICENSE.md file for details.

