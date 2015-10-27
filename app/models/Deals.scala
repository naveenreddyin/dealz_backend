package models

import play.api.db.slick.Config.driver.simple._

/**
 * Created by naveenkumarvasudevan on 10/25/15.
 */

case class Deals(did: Option[Long] = None, name: String, cid: Long)
class DealsTable(tag: Tag) extends Table[Deals](tag, "Deals"){
  def did = column[Long]("DID", O.AutoInc, O.PrimaryKey)
  def name = column[String]("name", O.NotNull)
  def cid = column[Long]("CID", O.NotNull)


  def * = (did.?, name, cid) <> (Deals.tupled, Deals.unapply _)

  val companies = TableQuery[CompanyTable]
  def companyId = foreignKey("COMPANY_FK",
    cid,
    companies)(_.cid,
    onUpdate = ForeignKeyAction.Restrict, onDelete = ForeignKeyAction.Cascade)

}
