package assets

import models.Company
import play.api.data._
import play.api.data.Forms._

/**
 * Created by naveen on 01.10.15.
 */

object getForms {

  def CompanyForm = Form(mapping(
  "id" -> ignored(1),
  "name" -> text,
  "address" -> text
  )(Company.apply)(Company.unapply _))

}

