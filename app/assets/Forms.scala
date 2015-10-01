package assets

import models.AddCompany
import play.api.data._
import play.api.data.Forms._

/**
 * Created by naveen on 01.10.15.
 */

object getForms {

  def addCompanyForm = Form(tuple("name" -> nonEmptyText,
    "address" -> nonEmptyText))

}

