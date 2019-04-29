package com.kco.bean.es;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 09:43
 */
@Data
@Document(indexName = "nposp_es", type = "_doc")
public class BpBean {
    private String bpId;
    private String bpName;
    private String bpType;
    private String teamId;
    private String allowIndividualApply;
    private String typeName;
}