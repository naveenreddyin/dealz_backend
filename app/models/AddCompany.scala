package models

/**
 * Created by naveen on 01.10.15.
 */
case class AddCompany(id: Long, name: String, address: String)

object AddCompany{
  def all(): List[AddCompany]  = Nil

  def create(name: String, address: String) {}

  def delete(id: Long) {}

}
