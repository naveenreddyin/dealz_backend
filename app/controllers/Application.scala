package controllers

import play.api._
import play.api.mvc._
import scala.slick.driver.MySQLDriver.simple._

import assets.getForms._

import scala.slick.jdbc.meta.MTable

object Application extends Controller {
  // The query interface for the Suppliers table

  def index = Action {

    Redirect(routes.Application.company())
  }

  def company = Action {
    Ok(views.html.addcompany("Please register your company.", addCompanyForm))
  }

  def saveCompany = Action{ implicit request =>
    val (name, address) = addCompanyForm.bindFromRequest.get
    Logger.debug(name)
    Ok("success")
  }

  def addCampaign = TODO

  def listCampaigns = TODO

}