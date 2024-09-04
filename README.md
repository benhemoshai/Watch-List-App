# Watch-List App 🎬

**Watch-List App** is an Android application that allows users to create and manage their own watch-list of movies. Users can select movies from an external list, add custom descriptions and dates, and organize them in their personal watch-list.

## Overview

This app provides a complete watch-list management system, enabling users to add, edit, and delete movies in their list. It leverages modern Android development tools and libraries to ensure a smooth and efficient user experience. The app follows the MVVM architecture pattern to maintain a clean and scalable codebase.

## Features

- **Add Movies to Watch-List:** Users can choose movies from an external list and add them to their watch-list.
- **Edit and Delete Items:** The watch-list can be fully customized by editing or removing items.
- **Movie Descriptions:** Users can add personalized descriptions and set dates for each movie in their list.

## Technologies Used

- **OMDB API:** For fetching movie data.
- **Retrofit:** For making network requests.
- **Room Library:** For local database management.
- **Dagger Hilt:** For dependency injection.
- **MVVM Architecture:** Ensures a clear separation of concerns and maintainability.

## Getting Started

To run the project locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/benhemoshai/Watch-List-App.git
   ```

2.Open the project in Android Studio:

   - Launch Android Studio.
   - Click on File > Open and navigate to the folder where you cloned the repository.
   - Select the Watch-List-App folder and click OK.

3.Sync the project with Gradle files:

   - Once the project is open, Android Studio will prompt you to sync the project with Gradle files.
   - Click Sync Now at the top of the window.

4.Build and run the app:

   - Connect an Android device or start an emulator.
   - In Android Studio, click the Run button or press Shift + F10 to build and run the app on your device.


## Project Structure

```
Watch-List-App/
|
├── data/ # Data layer (Retrofit service, Room entities)
   ├── local_db/ # Local database management (Room) 
   ├── models/ # Data models
   ├── remote_db/ # Remote API interactions (OMDB)
   ├── repository/ # Repository pattern for data handling 
├── di/ # Dependency Injection (Dagger Hilt modules)
├── ui/ # User Interface (Activities, Fragments, Adapters)
└── utils/ # Utility classes and helpers
```
