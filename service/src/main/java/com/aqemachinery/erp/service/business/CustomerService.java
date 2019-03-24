package com.aqemachinery.erp.service.business;

import com.aqemachinery.erp.dal.dao.CustomerMapper;
import com.aqemachinery.erp.dal.entity.CustomerEntity;
import com.aqemachinery.erp.service.dto.CustomerDTO;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;


    public Pair<String, Long> add(CustomerDTO customerDTO, String modifyUser) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity();
        dto2Entity(customerEntity, customerDTO);
        customerEntity.setCreator(modifyUser);
        customerEntity.setCreateTime(new Timestamp(System.currentTimeMillis()));
        customerEntity.setModifyUser(modifyUser);
        customerEntity.setModifyTime(new Timestamp(System.currentTimeMillis()));
        int rows = customerMapper.insert(customerEntity);
        return null;
    }

    public String update(CustomerDTO customerDTO, String modifyUser) throws Exception {
        CustomerEntity customerEntity = customerMapper.selectByPrimaryKey(customerDTO.getId());
        if(customerEntity == null) {
            return "无法获取客户信息";
        }
        dto2Entity(customerEntity, customerDTO);
        customerEntity.setModifyUser(modifyUser);
        customerEntity.setModifyTime(new Timestamp(System.currentTimeMillis()));
        int rows = customerMapper.updateByPrimaryKey(customerEntity);
        return null;
    }

    public String delete(Long id, String modifyUser) throws Exception {
        CustomerEntity customerEntity = customerMapper.selectByPrimaryKey(id);
        if(customerEntity == null) {
            return "无法获取客户信息";
        }
        customerEntity.setModifyUser(modifyUser);
        customerEntity.setModifyTime(new Timestamp(System.currentTimeMillis()));
        int rows = customerMapper.updateByPrimaryKey(customerEntity);
        return null;
    }

    public Pair<Integer, List<CustomerDTO>> list(Integer pageIndex, Integer pageSize) throws Exception {
        //List<CustomerEntity> customerEntities = customerMapper.updateByPrimaryKeySelective()
        return null;
    }

    public CustomerDTO get(Long id) throws Exception {
        return null;
    }

    private void dto2Entity(CustomerEntity customerEntity, CustomerDTO customerDTO) {
        customerEntity.setCustomerNo(customerDTO.getCustomerNo());
        customerEntity.setCustomerName(customerDTO.getCustomerName());
        customerEntity.setCustomerNickname(customerDTO.getCustomerNickname());
        customerEntity.setCustomerAdress(customerDTO.getCustomerAddress());
        customerEntity.setHomepage(customerDTO.getHomepage());

    }
}
