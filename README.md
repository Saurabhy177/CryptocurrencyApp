Cryptocurrency App Code
==================================

This project has been developed with the help of youtube tutorial:
https://www.youtube.com/watch?v=EF33KmyprEQ&list=PLOf92TQmqSoji7is_hRgOcU80TIjwpG29&index=19&t=2779s

The original source code can be downloaded from github:
https://github.com/philipplackner/CryptocurrencyAppYT/tree/app

Introduction
------------

Cryptocurrency is designed using MVVM clean architecture using Jetpack Compose in a single module. 
Retrofit library is used for interacting with coin paprika api.
Coin Paprika API:
coinpaprika.com

This app contains three layers:
a) Data Layer: This layer contains all the data related logic (databases, api calls and 
  implementations, etc).
b) Domain Layer: This layer contains only the business logic.
c) Presentation Layer: The layer contains all the UI logic and it is further divided into
  components. It contains the screens, states and view models.

This app lets you:
a) browse the list of various cryptocurrencies obtained from coin paprika.
b) get detailed information about any cryptocurrency.


Pre-requisites
--------------

You need to know:

* Building a basic user interface (UI) for an Android app, 
  using an activity, fragments, and views.
* Navigating between fragments and using Safe Args (a Gradle plugin) 
  to pass data between fragments.
* View models, view-model factories, and LiveData and its observers. 
  These Architecture Components topics are covered in an earlier codelab in this course.