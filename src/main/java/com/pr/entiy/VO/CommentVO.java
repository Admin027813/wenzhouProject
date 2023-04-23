package com.pr.entiy.VO;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

@Data
public class CommentVO {
    private Integer id;
    private Integer userId;
    private String  context;
    private Integer supportNum;
}
