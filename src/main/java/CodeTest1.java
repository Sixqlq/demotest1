import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.Data;

@Data
public class CodeTest1 {

    private String employee;
    private String leader;
    private Integer salary;
    private Integer leaderSalary;

    private static final Logger LOGGER = LoggerFactory.getLogger(CodeTest1.class);

    public Integer addSalary(CodeTest1 codeTest1) {
        LOGGER.debug("codeTest1: {}", codeTest1);
        int salary = codeTest1.salary + 1000;
        return salary;
    }
    public static void main(String[] args) {
        CodeTest1 codeTest1 = new CodeTest1();
        codeTest1.setEmployee("zhang san");
        codeTest1.setLeader("li si");
        codeTest1.setSalary(1000);
        Integer addSalary = codeTest1.addSalary(codeTest1);
        System.out.println(addSalary);
    }
}
