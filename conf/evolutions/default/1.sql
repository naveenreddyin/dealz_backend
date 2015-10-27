# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `Company` (`CID` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,`name` VARCHAR(254) NOT NULL,`address` VARCHAR(254) NOT NULL);
create table `Deals` (`DID` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,`name` VARCHAR(254) NOT NULL,`CID` BIGINT NOT NULL);
alter table `Deals` add constraint `COMPANY_FK` foreign key(`CID`) references `Company`(`CID`) on update RESTRICT on delete CASCADE;

# --- !Downs

ALTER TABLE Deals DROP FOREIGN KEY COMPANY_FK;
drop table `Deals`;
drop table `Company`;

