package controllers

import play.api._
import play.api.mvc._

import assets.getForms._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready...."))
  }

  def addCompany = Action {
    Ok(views.html.addcompany("Please register your company.", addCompanyForm))
  }

  def addCampaign = TODO

  def listCampaigns = TODO

}