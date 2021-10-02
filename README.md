Cryptocurrency App Code
==================================

This project has been developed with the help of youtube tutorial:<br>
https://www.youtube.com/watch?v=EF33KmyprEQ&list=PLOf92TQmqSoji7is_hRgOcU80TIjwpG29&index=19&t=2779s

The original source code can be downloaded from github:<br>
https://github.com/philipplackner/CryptocurrencyAppYT/tree/app

Introduction
------------

Cryptocurrency is designed using MVVM clean architecture using Jetpack Compose in a single module. <br>
Retrofit library is used for interacting with coin paprika api.<br>
Coin Paprika API:<br>
coinpaprika.com

This app contains three layers:<br>
a) <b>Data Layer:</b> This layer contains all the data related logic (databases, api calls and 
  implementations, etc).<br>
b) <b>Domain Layer:</b> This layer contains only the business logic.<br>
c) <b>Presentation Layer:</b> The layer contains all the UI logic and it is further divided into
  components. It contains the screens, states and view models. <br>

This app lets you:<br>
a) browse the list of various cryptocurrencies obtained from coin paprika.<br>
b) get detailed information about any cryptocurrency.<br>


Pre-requisites
--------------

You need to know:

* Building a basic user interface (UI) for an Android app, 
  using an activity, fragments, and views.
* Navigating between fragments and using Safe Args (a Gradle plugin) 
  to pass data between fragments.
* View models, view-model factories, and LiveData and its observers. 
  These Architecture Components topics are covered in an earlier codelab in this course.
