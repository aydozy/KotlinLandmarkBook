# Landmark Book - "Recycler View"

- A tool used to use dynamic lists more effectively: `Recycler View`.
  - Although RecyclerView has the same view as ListView, it is a more complex system to use.

Thanks to this application, we can better understand the _Recycler View_, and at the same time, we have the chance to repeat the frequently used _ViewBinding_ and _OOP(Object Oriented Programming)_.

>[!NOTE]
> **I combined this information from Android Studio's own page in general and what Atıl Samancıoğlu explained in the course.**
> **If you want to get more detailed information, you can check [AndroidStudio](https://developer.android.com/develop/ui/views/layout/recyclerview)'s own site.**

## A Closer Look at Recycler View 

RecyclerView makes it easy to efficiently display large sets of data. You supply the data and define how each item looks, and the RecyclerView library dynamically creates the elements when they're needed.

### Steps for implementing your RecyclerView
If you're going to use RecyclerView, there are a few things you need to do. They are explained in detail in the following sections.

1. Decide how the list or grid looks. Ordinarily, you can use one of the RecyclerView library's standard layout managers.

2. Design how each element in the list looks and behaves. Based on this design, extend the `ViewHolder` class. Your version of `ViewHolder` provides all the functionality for your list items. Your view holder is a wrapper around a `View`, and that view is managed by `RecyclerView`.

3. Define the `Adapter` that associates your data with the `ViewHolder` views.

### When you define your adapter, you override three key methods:

- `onCreateViewHolder():` RecyclerView calls this method whenever it needs to create a new ViewHolder. The method creates and initializes the ViewHolder and its associated View, but does not fill in the view's contents—the ViewHolder has not yet been bound to specific data.

- `onBindViewHolder():` RecyclerView calls this method to associate a ViewHolder with data. The method fetches the appropriate data and uses the data to fill in the view holder's layout. For example, if the RecyclerView displays a list of names, the method might find the appropriate name in the list and fill in the view holder's TextView widget.

- `getItemCount():` RecyclerView calls this method to get the size of the dataset. For example, in an address book, this might be the total number of addresses. RecyclerView uses this to determine when there are no more items that can be displayed.

### _Example of Recycler View_
![recycler view examples](https://github.com/aydozy/KotlinLandmarkBook/assets/104395137/63ce4543-7d33-45a2-bc06-8ca308eb7251)

## About App
In this application, the picture and what it is + where it is can be seen by clicking on the names in the list.

## App Images

- Home Screen
  
![homepage](https://github.com/aydozy/KotlinLandmarkBook/assets/104395137/cb15dcee-abe3-4833-a0b5-1002922293ad)

- Pisa

![pisa](https://github.com/aydozy/KotlinLandmarkBook/assets/104395137/236520a8-c2bf-40a9-a7a0-69955d7ea989)

- Taj Mahal

![tajmahal](https://github.com/aydozy/KotlinLandmarkBook/assets/104395137/1f4336fa-8581-460e-a451-1586a4276787)

- Burj Khalifa

![burjkhalifa](https://github.com/aydozy/KotlinLandmarkBook/assets/104395137/4a507332-1247-4657-990a-f8cf1f5eec1f)

- Eiffel Tower

![eiffeltower](https://github.com/aydozy/KotlinLandmarkBook/assets/104395137/64ba6585-7cd3-4181-b361-b7c31754a13b)


   
