package cn.edu.csust.coursecard.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zsw
 * @date 2019/11/19 21:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Course {
    private String couseName;
    private String time;
    private String address;
    private String xuefen;
    private String property;

}
