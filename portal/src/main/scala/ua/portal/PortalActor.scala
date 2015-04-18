package ua.portal

import akka.actor.Actor

/**
 * Created by Konfferance on 18.04.2015.
 */
class PortalActor extends Actor {

  // remote services
  val gamesService = context.actorSelection("akka.tcp://GamesServiceSystem@127.0.0.1:1010/user/GamesActor")
  val regService = context.actorSelection("akka.tcp://registration-system@127.0.0.1:2020/user/RegistrationService")

  var counter = 0

  override def receive: Receive = {
    case "START" => gamesService ! "Hello from the PortalActor"
    case msg: String => println("PortalActor received message: " + msg)
      if (counter < 5){
        if (counter % 2 == 0){
          gamesService ! "Request-GS from PortalActor"
        }else{
          regService ! "Request-RS from PortalActor"
        }
        counter += 1
      }
  }
}
