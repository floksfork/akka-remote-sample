package ua.registration

import akka.actor.{ActorSystem, Props}

/**
 * Created by Konfferance on 18.04.2015.
 */
object RegistationApp extends App {
  val system = ActorSystem("registration-system")
  val regActor = system.actorOf(Props[RegistrationService], name = "RegistrationService")

  regActor ! "The RegistrationService has been launched !"
}
