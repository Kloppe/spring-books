/**
 * @program SpringBooks
 * @description: Artical
 * @author: mf
 * @create: 2020/02/19 00:59
 */

package com.example.mybatis.bean;

import lombok.Data;

@Data
public class Artical {
    private Integer id;
    private String title;
    private String content;
    private Integer userId;
}
