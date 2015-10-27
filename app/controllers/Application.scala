package controllers

import play.api.mvc._


object Application extends Controller {

  def index = Action {

    Redirect(routes.CompanyController.company())
  }

  def addCampaign = TODO

  def listCampaigns = TODO

}