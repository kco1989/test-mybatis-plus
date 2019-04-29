package com.kco.es.repo;

import com.kco.bean.es.MerchantBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 09:49
 */
public interface MerchantRepository extends ElasticsearchRepository<MerchantBean, String> {

}
