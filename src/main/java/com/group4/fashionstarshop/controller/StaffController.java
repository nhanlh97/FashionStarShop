package com.group4.fashionstarshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group4.fashionstarshop.model.Staff;
import com.group4.fashionstarshop.service.StaffService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

//@RestController
//@RequestMapping("/fashion")
public class StaffController {
//    @Autowired
//    private StaffService service;
//
//    @PostMapping("/staff")
//    public Staff createStaff(@RequestBody Staff staff) {
//        return service.createStaff(staff);
//    }
//
//    @PutMapping("/staff/{id}")
//    public Staff updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
//        return service.updateStaff(id, staff);
//    }
//
//    @GetMapping("/staff/{id}")
//    public Staff getStaff(@PathVariable Long id) {
//        return service.getStaff(id);
//    }
//
//    @DeleteMapping("/staff/{id}")
//    public void deleteStaff(@PathVariable Long id) {
//        service.deleteStaff(id);
//    }
//
//    @GetMapping("/staff")
//    public List<Staff> getAllStaff() {
//        return service.getAllStaff();
//    }

}
