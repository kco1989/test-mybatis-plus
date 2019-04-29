package com.kco.bean.es;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 09:46
 */
@Data
@Document(indexName = "nposp_es", type = "_doc")
public class OrderBean {
    private String agentNo;
    private String orderNo;
    private String merchantNo;
    private BigDecimal transAmount;
    private String payMethod;
    private String transStatus;
    private String transType;
    private Date createDate;
    private Date transTime;
    private String bpId;
    private String typeName;
}

