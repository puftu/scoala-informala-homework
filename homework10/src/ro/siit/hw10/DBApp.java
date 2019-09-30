package ro.siit.hw10;

import java.sql.*;

public class DBApp {

    public static void main(String[] args) {
//        displayAllFromClasses();
//        displayCourseById(2);
//        displayClassesWithIntro();
//        displayClassesWithDep();
        displayClassesByProfname();
    }


    public static void displayAllFromClasses(){Connection conn = getConnection("mysql", "localhost", "3306", "school", "root", "Pluch2019");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        String format = "%10s%10s%10s%15s%15s%15s%15s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from classes");

            while (rs.next()) {
                int classId = rs.getInt("classid");
                int courseId = rs.getInt("courseid");
                int days = rs.getInt("days");
                String startTime = rs.getString("starttime");
                String endTime = rs.getString("endtime");
                String building = rs.getString("bldg");
                int roomNum = rs.getInt("roomnum");


                System.out.format(format, classId,courseId,days,startTime,endTime,building,roomNum);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }

    public static void displayCourseById(int id){Connection conn = getConnection("mysql", "localhost", "3306", "school", "root", "Pluch2019");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        String format = "%10s%15s%15s%15s%15s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from courses where courseid =" + id);

            while (rs.next()) {

                int courseId = rs.getInt("courseid");
                String area = rs.getString("area");
                String title = rs.getString("title");
                String description = rs.getString("descrip");
                String prereq = rs.getString("prereq");


                System.out.format(format, courseId,area, title,description,prereq);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }

    public static void displayClassesWithIntro(){Connection conn = getConnection("mysql", "localhost", "3306", "school", "root", "Pluch2019");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        String format = "%10s%10s%15s%20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from classes inner join courses on classes.courseid = courses.courseid where lower(courses.title) like \"intro%\"");

            while (rs.next()) {

                int classId = rs.getInt("classid");
                int courseId = rs.getInt("courseid");
                String area = rs.getString("area");
                String title = rs.getString("title");



                System.out.format(format,classId, courseId,area, title);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }

    public static void displayClassesWithDep(){Connection conn = getConnection("mysql", "localhost", "3306", "school", "root", "Pluch2019");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        String format = "%10s%10s%15s%20s%15s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from classes inner join crosslistings on \n" +
                    "classes.courseid = crosslistings.courseid where lower(crosslistings.dept) = \"cos\" \n" +
                    "and crosslistings.coursenum like \"3%\";");

            while (rs.next()) {

                int classId = rs.getInt("classid");
                int coursIid = rs.getInt("courseid");
                String bldg = rs.getString("bldg");
                String dept = rs.getString("dept");
                int courseNum = rs.getInt("coursenum");



                System.out.format(format,classId, coursIid,bldg,dept, courseNum);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }

    public static void displayClassesByProfname(){Connection conn = getConnection("mysql", "localhost", "3306", "school", "root", "Pluch2019");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        String format = "%10s%10s%15s%20s%15s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from classes inner join profs on classes.courseid = profs.profid where lower(profs.profname) like \"cos%\"");

            while (rs.next()) {

                int classId = rs.getInt("classid");
                int courseId = rs.getInt("courseid");
                String bldg = rs.getString("bldg");
                int profId = rs.getInt("profid");
                String profName = rs.getString("profname");




                System.out.format(format,classId, courseId,bldg,profId,profName);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }



    public static Connection getConnection(String dbType, String host, String port, String dbName, String username, String pass) {
        Connection conn = null;
        DriverManager.setLoginTimeout(60);
        try {
            StringBuilder connectionURL = new StringBuilder();
            connectionURL.append("jdbc:");
            connectionURL.append(dbType);
            connectionURL.append("://");
            connectionURL.append(host);
            connectionURL.append(":");
            connectionURL.append(port);
            connectionURL.append("/");
            connectionURL.append(dbName);
            connectionURL.append("?user=");
            connectionURL.append(username);
            connectionURL.append("&password=");
            connectionURL.append(pass);
            return DriverManager.getConnection(connectionURL.toString());
        } catch (SQLException e) {
            System.out.println("cannot connect to database " + e.getMessage());
        }
        return null;
    }
}
