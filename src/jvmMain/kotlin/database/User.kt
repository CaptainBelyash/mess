package database

import org.jetbrains.exposed.sql.*

object User : Table() {
    val id = uuid("id")
    val name = varchar("name", length = 50)

    override val primaryKey = PrimaryKey(id, name = "PK_User_ID")
}