package com.aqemachinery.erp.service.business;

import com.aqemachinery.erp.dal.dao.ContractMapper;
import com.aqemachinery.erp.service.dto.ContractDTO;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {

    @Autowired
    private ContractMapper contractMapper;


    public Pair<String, Long> add(ContractDTO contractDTO) throws Exception {
        return null;
    }

    public String update(ContractDTO contractDTO) throws Exception {
        return null;
    }

    public String delete(Long id, String modifyUser) throws Exception {
        return null;
    }

    public Pair<Integer, List<ContractDTO>> list(Integer pageIndex, Integer pageSize) throws Exception {
        return null;
    }

    public ContractDTO get(Long id) throws Exception {
        return null;
    }
}
