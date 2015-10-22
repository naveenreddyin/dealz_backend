package models

import play.api.db.slick.Config.driver.simple._

/**
 * Created by naveen on 01.10.15.
 */
case class Company(cid: Int, name: String, address: String)

/* Table mapping
 */
class CompanyTable(tag: Tag) extends Table[Company](tag, "Company") {
  def cid = column[Int]("CID", O.AutoInc, O.PrimaryKey)
  def name = column[String]("name", O.PrimaryKey)
  def address = column[String]("address", O.NotNull)

  def * = (cid, name, address) <> (Company.tupled, Company.unapply _)
}
