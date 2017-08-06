package com.lecture_20.lecture21;

import java.sql.*;

import static com.lecture_20.lecture21.ConnectionCarRental.getConnection;

public abstract class Update {

    private static Connection con;
    private static PreparedStatement stmt;

    private static PreparedStatement prep() {

        try {
            con = getConnection();
            String sql = "INSERT INTO car(" +
                    "vehicle_registration_number,car_brand_id,color_id,Year_of_issue) VALUES(?,?,?,?)";
            stmt = con.prepareStatement(sql);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return stmt;
    }

    public static void insertCar(
            String reg, int brand, int color, int year) {
        PreparedStatement ps = prep();
        try {
            ps.setString(1, reg);
            ps.setInt(2, brand);
            ps.setInt(3, color);
            ps.setInt(4, year);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException se) {
        }
        try {
            stmt.close();
        } catch (SQLException se) {
        }
    }

}

