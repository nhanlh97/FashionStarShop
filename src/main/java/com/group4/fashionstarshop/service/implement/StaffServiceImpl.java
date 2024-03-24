package com.group4.fashionstarshop.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.fashionstarshop.model.Staff;
import com.group4.fashionstarshop.repository.StaffRepository;
import com.group4.fashionstarshop.service.StaffService;
@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    private StaffRepository repository;

    @Override
    public Staff createStaff(Staff staff) {
        return repository.save(staff);
    }

    @Override
    public Staff updateStaff(Long id, Staff staff) {
        staff.setStaffId(id);
        return repository.save(staff);
    }

    @Override
    public Staff getStaff(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteStaff(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Staff> getAllStaff() {
        return repository.findAll();
    }

}
