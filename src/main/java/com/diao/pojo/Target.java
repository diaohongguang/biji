package com.diao.pojo;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Target {
    private Integer targetId;
    private String targetName;
    private Date targetCreateTime;
}
