/**
 * @program SpringBooks
 * @description: BookService
 * @author: mf
 * @create: 2020/01/26 17:29
 */

package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "label='" + label + '\'' +
                '}';
    }
}
