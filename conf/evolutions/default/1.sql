# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `Company` (`CID` INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,`name` VARCHAR(254) NOT NULL,`address` VARCHAR(254) NOT NULL);

# --- !Downs

drop table `Company`;

