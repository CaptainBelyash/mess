package database

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

class DataBase {
    fun setUpConnection() {
        Database.connect(
            "jdbc:postgresql://localhost:5432/mess",
            driver = "org.postgresql.Driver",
            user = "postgres",
            password = "password"
        )

        transaction {
            addLogger(StdOutSqlLogger)

            SchemaUtils.create(User)
        }
    }

    fun createUser(userName: String) {
        transaction {
            addLogger(StdOutSqlLogger)

            SchemaUtils.create(User)

            User.insert {
                it[id] = UUID.randomUUID()
                it[name] = userName
            }
        }
    }
}