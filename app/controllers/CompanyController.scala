package controllers

import assets.getForms._
import play.api._
import play.api.db.slick._
import play.api.db.slick.Config.driver.simple._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import play.api.Play.current
import play.api.mvc.BodyParsers._
import play.api.libs.json.Json
import play.api.libs.json.Json._

import models.{Company, CompanyTable}

/**
 * Created by naveenkumarvasudevan on 10/25/15.
 */
object CompanyController extends Controller{
  val companyTable = TableQuery[CompanyTable]

  //JSON read/write macro
  implicit val companyJsonFormat = Json.format[Company]

  def company = Action {
    Ok(views.html.addcompany("Please register your company.", CompanyForm))
  }

  def saveCompany = DBAction { implicit rs =>
    CompanyForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest("something wrong."+ formWithErrors)
      },
      Company => {
          val insertCompany = companyTable.insert(Company)
          Redirect(routes.CompanyController.company())

      }
    )


  }

  def showCompany(cid: Long) = DBAction {
    implicit request =>

      Ok("SDSDF "+cid)
  }

  def jsonListAllCompany = DBAction { implicit rs =>

      Ok(toJson(companyTable.list))


  }

}
