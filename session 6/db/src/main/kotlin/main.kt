import java.sql.*
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
    // Prepare credentials
    val credentials = credentials()
    val connectionProps = Properties()
    connectionProps["user"] = credentials.username
    connectionProps["password"] = credentials.password

// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    val statement = connection.prepareStatement("SELECT * FROM cities")
    val result = statement.executeQuery()
    while (result.next()){
        val cities = result.getString("city_name")
        println(cities)
    }

}
