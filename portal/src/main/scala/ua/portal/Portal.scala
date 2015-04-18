package ua.portal

import akka.actor.{ActorSystem, Props}

/**
  * Created by Konfferance on 18.04.2015.
  */
object Portal extends App {
   implicit val system = ActorSystem ("Portal")
   val portalActor = system.actorOf(Props[PortalActor], name="PortalActor")

   portalActor ! "START"
 }
