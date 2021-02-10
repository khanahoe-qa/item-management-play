package controllers

import models.Item
import play.api.data.Form
import play.api.i18n.Messages.implicitMessagesProviderToMessages
import play.api.i18n.{I18nSupport, Messages}

import javax.inject._
import play.api.mvc._

import scala.collection.mutable.ArrayBuffer

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with I18nSupport{

  val BASE_URL = "http://localhost:9000"

  def index = Action {
    Ok(views.html.index("Index page"))
  }

  def add = Action {
    Ok(views.html.add(ArrayBuffer.empty[Item], Item.createItemForm))
  }

  def listItems = Action { implicit request =>
    Ok(views.html.add(Item.items, Item.createItemForm))
  }

  def delete = Action {
    Ok(views.html.delete("Delete page"))
  }

  def view = Action {
    Ok(views.html.view("View page"))
  }

  def edit = Action {
    Ok(views.html.edit("Edit page"))
  }

}
