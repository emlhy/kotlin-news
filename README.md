## Kotlin News
*This is a demo app that displays Kotlin topics pulled from https://www.reddit.com/r/kotlin/.json
*It's using MVVM design partten.
*Main technologies include: Retrofit, LiveData, Coroutine...
*On the 'Main Activity', there is a list of topics showing in a RecyclerView. In each item, the title of the topic is on the top and a thumbnail is placed below the title if exist.
*When clicking on an item, user will be bring to a 'Detail Activity' showing title, image, and body of the topic.

**Note that there is no recent kotlin topic come with image. In order to check the image feature, you can go to RedditApiService and change the path from 'kotlin' to 'android'
