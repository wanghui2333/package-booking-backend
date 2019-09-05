package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import tws.entity.Express;

import java.util.List;

@Mapper
@Service
public interface ExpressMapper {
    List<Express> selectAll();
    void insert(@Param("express") Express express);

    void patchStatus(@Param("express") Express express);
}
