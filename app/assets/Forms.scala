package assets

import models.Company
import play.api.data._
import play.api.data.Forms._

/**
 * Created by naveen on 01.10.15.
 */

object getForms {

  def CompanyForm = Form(mapping(
  "name" -> text,
  "address" -> text
  )
    ((name,address) => Company(None, name, address))
    ((company: Company) => Some(company.name, company.address))
  )

}



