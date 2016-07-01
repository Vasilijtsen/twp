package controllers

import javax.inject._
import play.api.mvc.Controller
import play.api.mvc.Action


@Singleton
class HomeController extends Controller {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }

}
