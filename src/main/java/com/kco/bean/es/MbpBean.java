package com.kco.bean.es;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 09:48
 */
@Data
@Document(indexName = "nposp_es", type = "_doc")
public class MbpBean {
    private String agentNo;
    private String mid;
    private String merchantNo;
    private String bpId;
    private String status;
    private String typeName;
}
