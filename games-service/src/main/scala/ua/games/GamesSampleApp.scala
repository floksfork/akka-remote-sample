package ua.games

import akka.actor.{ActorSystem, Props}

/**
 * Created by Konfferance on 18.04.2015.
 */
object GamesSampleApp extends App {
  val system = ActorSystem ("GamesServiceSystem")
  val gamesActor = system.actorOf(Props[GamesActor], name = "GamesActor")

  gamesActor ! "The GamesService has been launched !"

}
