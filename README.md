# ⌚ learning-android-wear-os

<div align="center">
<img width="900" alt="image" src="https://github.com/CarolinaChavezDavid/learning-android-wear-os/assets/77591347/3da78df6-2e8f-46ae-9ed2-83619bc6145f">
</div>

## Principles of Wear OS development

* **Design for critical tasks:** Focus on one or two needs of your target users rather than a full app experience.
* **Optimize for the wrist:** Help people complete tasks on the watch within seconds to avoid ergonomic discomfort or arm fatigue.
* **Use the appropriate surface for the task:**
  * **Complication:** Use if you have a single unit of information that users are likely to want to glance at multiple times a day
    </br>  *Use complications to track the date, the user's water intake or steps, or the current weather.*

<div align="center">
<img width="500" alt="image" src="https://github.com/CarolinaChavezDavid/learning-android-wear-os/assets/77591347/349a563b-c6a0-4d1e-8335-4a5047f43ced">
</div

  * **Notification:** Use  If your content is high-value and highly contextual.
  * **Tile:**  provide quick, predictable access to information and actions to solve user needs.
    </br>*Use tiles to track the user’s daily activity progress, quick-start a workout, start a recently played song, or send a message to a favorite contact.*
  * **App:** An app is immersive, and it's similar to a mobile app's main user interface (UI), though there are some differences.
* **Add notifications to additional surfaces:**
* **Support offline scenarios:**
* **Provide relevant content**
* **Aid users in completing a task from another device:**
* **Improve user experience during an app cold start**

> ⭐ Display the highest-priority content in complications and notifications, and then use the larger space on tiles and your app to display more content appropriately.

## Wear OS Tiles


![4b11eb131519cc71](https://github.com/CarolinaChavezDavid/learning-android-wear-os/assets/77591347/b3061949-c778-4719-b197-9a40be10535d)


Tiles are full-screen surfaces which present information from a single app at a glance. With a simple swipe from the watch face, you can start a workout, jump to a message, or see details for the latest forecast, where each subsequent swipe lets you view the next tile.

Provide easy access to the information and actions users need in order to get things done. With a simple swipe from the wathc face, a user can find out the latest forecast or start a timer.
A tile runs as a part of the system UI instead of running in its own application container. We use a **Service** to describe the layout and content of the tile. The system UI will then render the tile when needed.

The entry point for a tile ys  a service. A class implementing a **TitleService** needs to specify two functions:

  ```

  > onResourcesRequest(requestParams: ResourcesRequest): ListenableFuture<Resources> ->(Maps string IDs to an image resource)
  > onTileRequest(requestParams: TileRequest): ListenableFuture<Tile> -> (Returns a description of a tile, including its layout. This is where define the layout of a tile, and how data is bound to it)

  ```

> ℹ️ **Horologist** is a group of libraries from google, that aim to supplement wear OS developers with features that are commonly required by developers but not yet availble in Jetpack.

> ⚠️ Tile service functions have relatively short time-outs (in the order of seconds). Use WorkManager to schedule tasks and instead read tile state from local storage.

  ```
> MessagingTileRenderer -> extends the TileRenderer class (another abstraction from Horologist Tiles). It's completely synchronous - state is passed to the renderer functions

  ```
