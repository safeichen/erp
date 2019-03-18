package com.aqemachinery.erp.service.business;

import com.aqemachinery.erp.dal.dao.CustomerMapper;
import com.aqemachinery.erp.service.dto.CustomerDTO;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;


    public Pair<String, Long> add(CustomerDTO customerDTO) throws Exception {
        return null;
    }

    public String update(CustomerDTO customerDTO) throws Exception {
        return null;
    }

    public String delete(Long id, String modifyUser) throws Exception {
        return null;
    }

    public Pair<Integer, List<CustomerDTO>> list(Integer pageIndex, Integer pageSize) throws Exception {
        return null;
    }

    public CustomerDTO get(Long id) throws Exception {
        return null;
    }
}
