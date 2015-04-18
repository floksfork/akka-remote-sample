package ua.games

import akka.actor.Actor

/**
 * Created by Konfferance on 18.04.2015.
 */
class GamesActor extends Actor {
  override def receive: Receive = {
    case msg: String =>
      println("Games Service received message: " + msg)
      sender ! "Some info from Games Service"
  }
}
