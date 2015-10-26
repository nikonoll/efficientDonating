package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready to safe the world."))
  }

  def test = Action {
    Ok(views.html.test("This is the test page"))
  }
}
