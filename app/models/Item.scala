package models

import play.api.data.Form
import play.api.data.Forms._

import scala.collection.mutable.ArrayBuffer

case class Item(name: String, desc: String, price: BigDecimal, stock: Int)

object Item {

	val createItemForm = Form(
		mapping(
			"name" -> nonEmptyText,
			"desc" -> text,
			"price" -> bigDecimal,
			"stock" -> number
		)(Item.apply)(Item.unapply)
	)

	val items = ArrayBuffer.empty[Item]
}
