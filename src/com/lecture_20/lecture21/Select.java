package com.lecture_20.lecture21;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.lecture_20.lecture21.ConnectionCarRental.getConnection;


public abstract class Select {
    private static String query =
            "select brand, vehicle_registration_number," +
                    " color, Year_of_issue from car " +
                    "join color on car.color_id = color.color_id " +
                    "join car_brand on car.car_brand_id = car_brand.car_brand_id " +
                    "GROUP BY car_id" +
                    " ORDER BY Year_of_issue";

    public static void selectCarList() {
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)
        ) {
            while (rs.next()) {
                String brand = rs.getString(1);
                String reg = rs.getString(2);
                String color = rs.getString(3);
                int year = rs.getInt(4);
                System.out.printf("Марка авто: %s, гос. номер: %s, Цвет: %s, Год выпуска: %d\n"
                        ,brand, reg, color, year);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}
