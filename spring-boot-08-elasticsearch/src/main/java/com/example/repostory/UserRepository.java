package com.example.repostory;

import com.example.domain.User;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-04-19 15:45:00
 */

public interface UserRepository extends ElasticsearchRepository<User, Long> {

    List<User> findByAgeBetween(Integer age1, Integer age2);

    List<User> findByName(String name);

    @Query("{\n" +
            "    \"bool\": {\n" +
            "      \"must\": [\n" +
            "        {\n" +
            "          \"range\": {\n" +
            "            \"age\": {\n" +
            "              \"gte\": \"?0\",\n" +
            "              \"lte\": \"?1\"\n" +
            "            }\n" +
            "          }\n" +
            "        },{\n" +
            "          \"range\": {\n" +
            "            \"age\": {\n" +
            "              \"gte\": \"?2\",\n" +
            "              \"lte\": \"?3\"\n" +
            "            }\n" +
            "          }\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  }")
    List<User> findByQuery(Integer age1, Integer age2, Integer age3, Integer age4);
}
