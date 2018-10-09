package net.ukr.dreamsicle.dataBase.jdbcTest;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExampleBlob {
   /* String nameTable = "BoksTest";

    getDropTable(statement, nameTable);
        statement.executeUpdate("create table IF NOT EXISTS " + nameTable + " (id int not null AUTO_INCREMENT, name VARCHAR(30) not null, img BLOB,dt DATE, PRIMARY KEY(id));");

    BufferedImage image = ImageIO.read(new File("app.png"));
    Blob blob = connection.createBlob();
        try (OutputStream outputStream = blob.setBinaryStream(1)) {
        ImageIO.write(image, "png", outputStream);
    }

    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " + nameTable + " (name, img) values (?,?)");
        preparedStatement.setString(1, "inferno");
        preparedStatement.setBlob(2, blob);
        preparedStatement.executeUpdate();

    //            connection.prepareStatement("SELECT * FROM " + nameTable + " ");
    ResultSet resultSet = preparedStatement.executeQuery("SELECT * FROM " + nameTable);

        while (resultSet.next()) {
        BufferedImage bufferedImage = ImageIO.read(blob.getBinaryStream());
        File output = new File("apps.png");
        ImageIO.write(bufferedImage, "png", output);
    }*/
}
