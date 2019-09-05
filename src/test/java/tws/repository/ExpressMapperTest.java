package tws.repository;

import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MybatisTest
public class ExpressMapperTest {

//    @Autowired
//    private  EmployeeMapper employeeMapper;
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @After
//    public void tearDown() throws Exception {
//        JdbcTestUtils.deleteFromTables(jdbcTemplate,"employee");
//    }
//
//    @Test
//    public void shouldFetchAllEmployees() {
//        // given
//        jdbcTemplate.execute("INSERT INTO EMPLOYEE VALUES(1,'zhangsan', 21);");
//        // when
//        List<Employee> employeeList = employeeMapper.selectAll();
//        // then
//        assertEquals(1,employeeList.size());
//    }
}
