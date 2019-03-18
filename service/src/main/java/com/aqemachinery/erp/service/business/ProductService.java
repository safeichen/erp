package com.aqemachinery.erp.service.business;

import com.aqemachinery.erp.dal.dao.ProductMapper;
import com.aqemachinery.erp.service.dto.ProductDTO;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;


    public Pair<String, Long> add(ProductDTO productDTO) throws Exception {
        return null;
    }

    public String update(ProductDTO productDTO) throws Exception {
        return null;
    }

    public String delete(Long id, String modifyUser) throws Exception {
        return null;
    }

    public Pair<Integer, List<ProductDTO>> list(Integer pageIndex, Integer pageSize) throws Exception {
        return null;
    }

    public ProductDTO get(Long id) throws Exception {
        return null;
    }
}
