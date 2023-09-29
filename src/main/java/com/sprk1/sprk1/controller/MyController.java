package com.sprk1.sprk1.controller;

import com.sprk1.sprk1.entity.Course;
import com.sprk1.sprk1.services.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.sprk1.sprk1.db_utils.dbUtils.getConnected;

@RestController
public class MyController {
    @Autowired
    private courseService courseService;
    @GetMapping("/home")
    public StringBuilder home() throws SQLException {

        String query = "SELECT * FROM user";
        StringBuilder a = new StringBuilder();
        try (var conn = getConnected(); Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(query)) {
                while (rs.next()) {
                    a.append("ID:\t\t").append(rs.getInt("ID"));
                    a.append(" First Name:\t").append(rs.getString("FirstName"));
                    a.append(" Last Name:\t").append(rs.getString("LastName"));
                    a.append(" Email:\t\t").append(rs.getString("Email"));
                }
            }

        }
        return a;
    }
    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourses();
    }
    @GetMapping("/Contactus")
    public String Contactus(){
        return "Contact Us";
    }
    @GetMapping("/About")
    public String About(){
        return "About";
    }
    @GetMapping("/Login")
    public String Login(){
        return "Login";
    }
    @PostMapping("/Login")
    public String PostLogin(){
        return "logged_out";
    }
    @PostMapping("/Signout")
    public String Signout(){
        return "signed_out";
    }
    @GetMapping("/SignIn")
    public String SignIn(){
        return "SignIN";
    }
    @GetMapping("/Dashboard/*")
    public String Dashboardfwd(){
        return "Dashboardfwd";
    }
    @GetMapping("/Dashboard")
    public String Dashboard(){
        return "Dashboard";
    }
}
