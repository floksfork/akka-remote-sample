package ua.registration

import akka.actor.Actor

/**
 * Created by Konfferance on 18.04.2015.
 */
class RegistrationService extends Actor {
  override def receive: Receive = {
    case msg: String => println ("Registration Service received message: " + msg)
      sender ! "Some info from Registration Service"
  }
}
