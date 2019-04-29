package com.kco.bean.es;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 09:40
 */
@Data
@Document(indexName = "nposp_es", type = "_doc")
public class AgentBean {
    private String agentNo;
    private String agentNode;
    private String agentName;
    private Integer agentLevel;
    private String parentId;
    private String oneLevelId;
    private String email;
    private String mobilephone;
    private Date createDate;
    private String typeName;
}