package com.pr.entiy.VO;

import lombok.Data;

import java.util.List;

@Data
public class CommentVO {
    private Integer userId;
    private String  context;
    private Integer supportNum;
    private List<CommentVO> commentVOList;
}
