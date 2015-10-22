package controllers

import models.{CompanyTable}
import play.api._
import play.api.mvc._

import assets.getForms._
import play.api.db.slick._
import play.api.db.slick.Config.driver.simple._

object Application extends Controller {
  val companyTable = TableQuery[CompanyTable]

  def index = Action {

    Redirect(routes.Application.company())
  }

  def company = Action {
    Ok(views.html.addcompany("Please register your company.", CompanyForm))
  }

  def saveCompany = DBAction { implicit request =>
    CompanyForm.bindFromRequest.fold(
    formWithErrors => {
      BadRequest("something wrong."+ formWithErrors)
    },
    Company => {
      val insertCompany = companyTable.insert(Company)
      Ok("success")
    }
    )


  }

  def addCampaign = TODO

  def listCampaigns = TODO

}