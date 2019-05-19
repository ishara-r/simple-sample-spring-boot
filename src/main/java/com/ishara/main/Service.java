package com.ishara.main;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Service {
    @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
    @ResponseBody
    public ResponseEntity<?> getAllStudents() {
        return  new ResponseEntity<List<Emp>>(new DummyDb().getAllEmp(), HttpStatus.OK);
    }
}